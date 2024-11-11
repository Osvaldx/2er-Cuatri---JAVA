package ejercicios_l02_build;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class comandosArchivo {
   
    public static <T> boolean guardar(T dato, String path, boolean agregar) {
        boolean rta = false;
        
        try(FileWriter fw = new FileWriter(path,agregar)) {
            fw.write(dato.toString() + "\n");
            rta = true;
        }
        catch(IOException e) {
            System.out.println("[!] Error: " + e.getMessage());
        }
        
        return rta;
    }
    
    public static String leer(String path) {
        StringBuilder sb = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while((linea = br.readLine()) != null) {
                sb.append(linea).append("\n");
            }
        }
        catch(IOException e) {
            System.out.println("[!] Error: " + e.getMessage());
        }
        
        return sb.toString();
    }
    
    public static boolean buscarAlumno(int legajo, String path) {
        boolean rta = false;
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while((linea = br.readLine()) != null) {
                String[] separado = linea.split("-");
                if(separado[0].equals(String.valueOf(legajo))) {
                    System.out.println("[+] Alumno encontrado, legajo: " + legajo);
                    rta = true;
                }
            }
        }
        catch(IOException e) {
            System.out.println("[!] Error: " + e.getMessage());
        }
        
        return rta;
    }
    
    public static boolean modificarAlumno(Alumno alumno, String path) {
        boolean rta = false;
        Scanner input = new Scanner(System.in);
        String contenido = "";
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while((linea = br.readLine()) != null) {
                String[] separado = linea.split("-");
                if(!separado[0].isEmpty()) {
                    if(!separado[0].equals(String.valueOf(alumno.getLegajo()))) {
                        contenido += linea + "\n";
                    }
                    else {
                        System.out.print("Introduzca el Apellido: ");
                        separado[1] = input.nextLine();
                        System.out.print("Introduzca el Nombre: ");
                        separado[2] = input.nextLine();
                        
                        contenido += separado[0] + "-" + separado[1] + "-" + separado[2] + "\n";
                        System.out.println("[+] Alumno modificado con exito!");
                        rta = true;
                    }
                }
            }
        }
        catch(IOException e) {
            System.out.println("[!] Error: " + e.getMessage());
        }
        
        comandosArchivo.guardar(contenido, path, false);
        
        return rta;
    }
    
    public static boolean eliminarAlumno(Alumno alumno, String path) {
        boolean rta = false;
        String contenido = "";
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while((linea = br.readLine()) != null) {
                String[] separado = linea.split("-");
                if(!separado[0].isEmpty()) {
                    if(!separado[0].equals(String.valueOf(alumno.getLegajo()))) {
                        contenido += linea + "\n";
                    }
                    else {
                        System.out.println("[-] Se elimno el alumno: " + alumno.getLegajo());
                        rta = true;
                    }
                }
            }
        }
        catch(IOException e) {
            System.out.println("[!] Error: " + e.getMessage());
        }
        
        comandosArchivo.guardar(contenido, path, false);
        
        return rta;
    }
}
