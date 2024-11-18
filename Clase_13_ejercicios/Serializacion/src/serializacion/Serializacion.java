package serializacion;

import com.google.gson.Gson;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class Serializacion {

    public static void main(String[] args) {
        Persona persona1 = new Persona(46210110, "Nahuel");
        Persona persona2 = new Persona(47119897, "Ivo");
        
        Serializacion.serializacionBinaria(persona1);
        Serializacion.deserializacionBinaria();
        
    }
    
    public static void serializacionBinaria(Object persona) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("datos.dat"))) {
            oos.writeObject(persona);
        }
        catch(Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
    
    public static void deserializacionBinaria() {
        try(ObjectInputStream oos = new ObjectInputStream(new FileInputStream("datos.dat"))) {
            Persona persona1 = (Persona) oos.readObject();
            System.out.println(persona1.toString());
        }
        catch(Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
    
}
