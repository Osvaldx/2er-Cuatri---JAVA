package ejercicios_k02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicios_K02 {

    public static void main(String[] args) throws MiExcepcion {
        try {
            Ejercicios_K02.metodoEstatico();
        }
        catch(MiExcepcion e) {
            String fechahoy = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmm"));
            String mensaje = "[!] ERROR -> main() " + e.getMessage();
            ArchivoTexto.guardar(fechahoy + ".txt", mensaje);
        }
    }
    
    public static void metodo1() throws MiExcepcion {
        try {
            metodo2();
        }
        catch (MiExcepcion e) {
            throw new MiExcepcion("[!] Error en el metodo 1 -> " + e.getMessage() + "\n");
        }
    }
    
    public static void metodo2() throws MiExcepcion {
        try {
            metodo3();
        }
        catch (MiExcepcion e) {
            throw new MiExcepcion("[!] Error en el metodo 2 -> " + e.getMessage() + "\n");
        }
    }
    
    public static void metodo3() throws MiExcepcion {
        try {
            metodo4();
        }
        catch (MiExcepcion e) {
            throw new MiExcepcion("[!] Error en el metodo 3 -> " + e.getMessage() + "\n");
        }
    }
    
    public static void metodo4() throws MiExcepcion {
        throw new MiExcepcion("[!] Error inicial metodo4");
    }
    
    public static void metodoEstatico() throws MiExcepcion {
        try {
            Ejercicios_K02 miClase = new Ejercicios_K02();
            miClase.metodoInstancia();
        }
        catch (MiExcepcion e) {
            throw new MiExcepcion("[!] Error en el metodo : metodoEstatico() -> " + e.getMessage() + "\n");
        }
    }
    
    public void metodoInstancia() throws MiExcepcion {
        throw new MiExcepcion("[!] Error en el metodo : metodoInstancia()");
    }
}
