/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_c03;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Nicolas
 */
public class Persona {
    
    // ATRIBUTOS
    
    private String nombre;
    private String fechaDeNacimiento;
    private int dni;
    
    // CONSTRUCTOR
    
    public Persona(String nombre, String fechaDeNacimiento, int dni)
    {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.dni = dni;
    }
    
    // SETTERS
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    public void setDni(int dni) {
        this.dni = dni;
    
    }
    
    // GETTERS
    
    public String getNombre() {
        return nombre;
    }
    
    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
    
    public int getDNI() {
        return dni;
    }

    // METODOS DE CLASE
    
    private long calcularEdad()
    {
        String[] fechaDividida = this.fechaDeNacimiento.split("/");
        
        LocalDate diaActual = LocalDate.now();
        
        int dia = Integer.parseInt(fechaDividida[0]);
        int mes = Integer.parseInt(fechaDividida[1]);
        int anio = Integer.parseInt(fechaDividida[2]);
        
        LocalDate fechaParseada = LocalDate.of(anio, mes, dia);
        
        long edadPersona = ChronoUnit.YEARS.between(fechaParseada, diaActual);
        
        return edadPersona;
    }
    
    public String esMayorDeEdad()
    {
        long edadPersona = calcularEdad();
        String mensaje = "Es menor de edad";
        
        if(edadPersona > 18)
        {
            mensaje = "Es mayor de edad";
        }
        
        return mensaje;
        
    }
    
    public String mostrar()
    {
        String informacion = "----------------------------------\n" +
                             "Nombre: " + this.nombre + "\n" +
                             "Fecha de nacimiento: " + this.fechaDeNacimiento + "\n" +
                             "DNI: " + this.dni + "\n" +
                             "Edad: " + calcularEdad() + " " + esMayorDeEdad() + "\n" +
                             "----------------------------------\n";
        
        return informacion;
    }
    
}
