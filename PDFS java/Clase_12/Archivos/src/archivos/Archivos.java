package archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author maxin
 */
public class Archivos {

    public static void main(String[] args) {
        
        
        Archivos.mostrarEjemplos1();
        
        Archivos.mostrarEjemplos2();
                    
    }
    
    private static void mostrarEjemplos1() {
        
        // La clase File
        
        String rutaAbsoluta = "C:/Users/maxin/Documents/NetBeansProjects/2024/Archivos/recursos";
        
        File directorio = new File(rutaAbsoluta);
        
        if( ! directorio.exists()){ // NO existe el directorio
            if (directorio.mkdir()) { // Se intenta crear el directorio
                
                System.out.println(directorio.getAbsolutePath());
                // C:/Users/maxin/Documents/NetBeansProjects/2024/Archivos/recursos

                // Establecer permisos de lectura, escritura y ejecución
                directorio.setReadable(true, false);  // Permitir lectura para todos
                directorio.setWritable(true, false);  // Permitir escritura para todos
                directorio.setExecutable(true, false);  // Permitir ejecución para todos

                System.out.println("Lectura: " + directorio.canRead());
                System.out.println("Escritura: " + directorio.canWrite());
                System.out.println("Ejecución: " + directorio.canExecute());
                
            } else {
                System.out.println("No se pudo crear el directorio.");
            }
        }


        //Escritura de archivo con FileWriter
        
        if(directorio.exists()){

            // Se crea el archivo (se sobrescribe) y luego se agrega texto.
            try (FileWriter fw = new FileWriter(directorio.getAbsolutePath()+ "/archivo.txt")) {// Al finalizar, se cierra
                
                fw.write("Esta es una línea de texto.\n");
            
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo: " + e.getMessage());
            }
            
            // Se crea el archivo (o se abre) y luego se agrega texto.
            try (FileWriter fw = new FileWriter(directorio.getAbsolutePath()+ "/archivo.txt", true)) {// Al finalizar, se cierra
                
                fw.write("----------------------------------------\n");
                fw.write("Esta es una línea de texto agregaga.\n");
                fw.write("La fecha es: " + LocalDateTime.now().toLocalDate() + "\n");
            
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo: " + e.getMessage());
            }
        }
        
        //Lectura de archivo con FileReader

        // Si el archivo no existe, genera una excepción
        try (FileReader fr = new FileReader(directorio.getAbsolutePath() + "/archivo.txt")) {
            
            int caracter;
            while ((caracter = fr.read()) != -1) {
                
                System.out.print((char) caracter);
            }
            
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        
        //Escritura de archivo con BufferedWriter
        
        String rutaArchivo = "./recursos/archivo_buffered.txt";
        
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivo))) {
            
            escritor.write("Este es el primer mensaje.");
            escritor.newLine();
            escritor.write("Este es el segundo mensaje.");
            
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
        }

        //Lectura de archivo con BufferedReader

        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
            
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
            
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }

        //Más métodos de la clase File

        String rutaRelativa = "./recursos2";

        File directorio_relativo = new File(rutaRelativa);
        
        if( ! directorio_relativo.exists()){ // NO existe el directorio
            if (directorio_relativo.mkdir()) {// Se intenta crear el directorio
                
                System.out.println("Directorio creado: " + directorio_relativo.getAbsolutePath());
            }
            else {
                System.out.println("No se pudo crear el directorio.");
            }
        }
        
        if(directorio_relativo.exists()){ // Si existe el directorio
                        
            // Se borra el directorio (tiene que estar vacío)
            
            directorio_relativo.delete();
            
            System.out.println("Se elimina el directorio...");
        }
        
        // Obtener directorio actual
        System.out.println("Directorio actual: " + System.getProperty("user.dir"));
        
    } 
    
    private static void mostrarEjemplos2(){
               
        try {
            
            String rutaArchivo = "./recursos/archivo_buffered.txt";
            
            // Crea un objeto Path a partir de una cadena
            Path archivo = Paths.get(rutaArchivo);
            System.out.println(archivo);
            
            //Obtine el nombre del archivo
            System.out.println(archivo.getFileName());
            
            try {
                
                // Lee todo el archivo completo y las separa por líneas (hasta 'enter' o fin de archivo).
                List<String> lineas = Files.readAllLines(archivo);
                
                lineas.forEach(System.out::println);
                
            } catch (IOException e) {
                System.out.println("Error al leer el archivo: " + e.getMessage());
            }
            
            // Lee y retorna todo el archivo (desde el primer caracter hasta el fin de archivo)
            String archivoCompleto = Files.readString(archivo);
            
            System.out.println("Se muestra todo el archivo:");
            System.out.println(archivoCompleto);
            
            
            Path destino = Paths.get(System.getProperty("user.dir") + "/copia.txt");
            System.out.println(destino);
            
            try {
                // Copia un archivo
                Files.copy(archivo, destino);
                
            } catch (IOException e) {
                System.out.println("Error al copiar archivo: " + e.getMessage());
            }
            
            // Colección de 'palabras'
            List<String> lineas = Arrays.asList("Línea 1", "Línea 2", "Línea 3");
            
            try {
                // Escribe en un archivo de texto con un determinado juego de caracteres y en modo 'agregar'
                Files.write(destino, lineas, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
                
                String contenido = "Cadena de caracteres\nCon varias líneas de código";
                
                // Escribe en un archivo de texto con un determinado juego de caracteres y en modo 'agregar'
                Files.writeString(destino, contenido, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
                
                //Files.write(destino, contenido, StandardCharsets.UTF_8, StandardOpenOption.APPEND);// ERROR
                //Files.writeString(destino, lineas, StandardCharsets.UTF_8, StandardOpenOption.APPEND);// ERROR
                
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo: " + e.getMessage());
            }
            
            // Verifica la existencia de un archivo
            if(Files.exists(destino)) {
                
                try {
                    // Borra un archivo
                    Files.delete(destino);
                    
                } catch (IOException e) {
                    System.out.println("Error al borrar archivo: " + e.getMessage());
                }
            }           
            
        } catch (IOException ex) {
            System.out.println("Error global: " + ex.getMessage());
        }        
        
    }

}