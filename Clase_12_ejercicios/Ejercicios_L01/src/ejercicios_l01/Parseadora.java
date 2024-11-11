package ejercicios_l01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Parseadora {

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
    }
    
    private static boolean verificarSiExisteDirectorio(String rutaDirectorio) {
        boolean rta = false;
        File directorio = new File(rutaDirectorio);

        if(directorio.exists()) {
            rta = true;
        }
        else {
            rta = directorio.mkdir();
        }

        return rta;
    }
    
    private static boolean verificarSiExisteArchivo(String rutaDirectorio,String archivo) {
        boolean rta = false;
        
        if(Parseadora.verificarSiExisteDirectorio(rutaDirectorio)) {
            try (FileWriter fw = new FileWriter(rutaDirectorio + "/" + archivo)) {
                fw.write("hola");
                rta = true;
            }
            catch(IOException e) {
                System.out.println("Error al crear el archivo -> " + e.getMessage());
            }
        }
        
        return rta;
    }
    
}
