/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_c04;

import java.util.Random;

/**
 *
 * @author Nicolas
 */
public class Estudiante {
    
    // ATRIBUTOS DE INSTANCIA
    private String apellido;
    private String nombre;
    private String legajo;
    private int notaPrimerParcial;
    private int notaSegundoParcial;
    
    // ATRIBUTO DE CLASE
    private static Random random;
    
    static {
        random = new Random();
    }
    
    // CONSTRUCTOR
    
    public Estudiante(String apellido, String nombre, String legajo)
    {
        this.apellido = apellido;
        this.nombre = nombre;
        this.legajo = legajo;
    }
    
    // SETTERS
    
    public void setNotaPrimerParcial(int notaPrimerParcial)
    {
        this.notaPrimerParcial = notaPrimerParcial;
    }

    public void setNotaSegundoParcial(int notaSegundoParcial) {
        this.notaSegundoParcial = notaSegundoParcial;
    }
    
    private float calcularPromedio()
    {
        float promedio = (this.notaPrimerParcial + this.notaSegundoParcial) / 2;
        
        return promedio;
    }
    
    public double calcularNotaFinal()
    {
        double retorno = -1;
        
        if(this.notaPrimerParcial >= 4 && this.notaSegundoParcial >= 4)
        {
            retorno = random.nextDouble(6,11);
        }
        
        return retorno;
    }
    
    public StringBuilder mostrar()
    {
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("----------------------------------\n");
        mensaje.append("Apellido: " + this.apellido + "\n");
        mensaje.append("Nombre: " + this.nombre + "\n");
        mensaje.append("N°Legajo: " + this.legajo + "\n");
        mensaje.append("Nota 1° Parcial: " + this.notaPrimerParcial + "\n");
        mensaje.append("Nota 2° Parcial: " + this.notaSegundoParcial + "\n");
        mensaje.append("Promedio: " + calcularPromedio() + "\n");
        
        double notaFinal = calcularNotaFinal();
        
        if(notaFinal != -1)
        {
            mensaje.append("Nota Final: " + notaFinal);
        }
        else
        {
            mensaje.append("Alumno Desaprobado!");
        }
        mensaje.append("\n----------------------------------");
        
        return mensaje;
    }
    
}
