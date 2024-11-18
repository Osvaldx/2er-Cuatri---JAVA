package ejercicios_k02;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ArchivoTexto {
    
    public static boolean guardar(String path, String datos) {
        boolean rta = false;
        
        try(FileWriter fw = new FileWriter(path)) {
            fw.write(datos);
            rta = true;
            System.out.println("[+] Se guardo la informacion con exito!");
        }
        catch(IOException e) {
            System.out.println("[!] ERROR: " + e.getMessage());
        }
        
        return rta;
    }
    
    public static String leer(String path) {
        String contenido = "";
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while((linea = br.readLine()) != null) {
                contenido += linea + "\n";
            }
        }
        catch(IOException e) {
            System.out.println("[!] ERROR: " + e.getMessage());
        }
        
        return contenido;
    }
}
