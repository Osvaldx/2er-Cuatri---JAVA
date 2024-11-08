package ejercicios_k02;

public class Ejercicios_K02 {

    public static void main(String[] args) throws MiExcepcion {
        metodo1();
        
        try {
            Ejercicios_K02 miClase = new Ejercicios_K02();
            miClase.metodoInstancia();
        }
        catch (MiExcepcion e) {
            throw new MiExcepcion("[!] Error originario en el Main -> " + e.getMessage() + "\n");
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
    
    public void metodoInstancia() throws MiExcepcion {
        try {
            metodoEstatico();
        }
        catch (MiExcepcion e) {
            throw new MiExcepcion("[!] Error en el metodo : metodoInstancia() -> " + e.getMessage() + "\n");
        }
    }
    
    public static void metodoEstatico() throws MiExcepcion {
        throw new MiExcepcion("[!] Error en el metodo : metodoEstatico()");
    }
    
}
