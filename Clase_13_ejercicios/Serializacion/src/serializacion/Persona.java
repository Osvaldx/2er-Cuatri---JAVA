package serializacion;

import java.io.Serializable;

public class Persona implements Serializable{
    private static final long serialVersionUID = 1L;
    private int DNI;
    private String nombre;
    
    public Persona(int dni, String nombre) {
        this.DNI = dni;
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "Persona: [nombre=" + nombre + " dni=" + DNI + "]";
    }
}
