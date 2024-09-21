package ejerciciose01;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Persona {

    private String apellido;
    private String nombre;
    private int anioNacimiento;

    Persona(String apellido, String nombre, int anio_nacimiento) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.anioNacimiento = anio_nacimiento;
    }

    public String getNombreCompleto() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Nombre: ").append(this.nombre).append(" \n");
        sb.append("Apellido: ").append(this.apellido);
        
        return sb.toString();
    }

    public int getEdadActual() {
        LocalDate fechaActual = LocalDate.now();
        
        int anioActual = fechaActual.getYear();
        int edadCalculada = anioActual - this.anioNacimiento;
        
        return edadCalculada;
    }

    public boolean validacionMayorEdad() {
        boolean retorno = false;
        if(this.getEdadActual() >= 18) {
            retorno = true;
        }
        
        return retorno;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombreApellido(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String mostrarInformacion() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(this.getNombreCompleto()).append("\n");
        sb.append("Año: ").append(this.anioNacimiento).append("\n");
        sb.append("Edad: ").append(this.getEdadActual());
        
        return sb.toString();
    }

}