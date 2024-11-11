package ejercicios_l02_build;

public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    
    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString() {
        return legajo + "-" + apellido + "-" + nombre;
    }
    
}
