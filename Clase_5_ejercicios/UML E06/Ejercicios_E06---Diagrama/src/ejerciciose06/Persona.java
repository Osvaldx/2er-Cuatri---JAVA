package ejerciciose06;

import java.time.LocalDate;
import java.time.Period;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Persona {

    private String apellido;
    private String nombre;
    private LocalDate fecha_nacimiento;
    private Domicilio domicilio;

    Persona(String apellido, String nombre, LocalDate fecha_nacimiento, Domicilio domicilio) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.domicilio = domicilio;
    }

    public String getNombreCompleto() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Nombre: ").append(this.nombre).append(" \n");
        sb.append("Apellido: ").append(this.apellido);
        
        return sb.toString();
    }

    public int getEdadActual() {
        LocalDate fechaActual = LocalDate.now();
        Period edad = Period.between(this.fecha_nacimiento, fechaActual);
        
        return edad.getYears();
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
        sb.append("Fecha nacimiento: ").append(this.fecha_nacimiento).append("\n");
        sb.append("Edad: ").append(this.getEdadActual());
        sb.append(this.domicilio.getDatosDomicilio());
        
        return sb.toString();
    }

}