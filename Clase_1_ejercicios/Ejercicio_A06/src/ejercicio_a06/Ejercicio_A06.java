/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_a06;

import java.util.Scanner;

/**
 *
 * @author Nahuel
 */
public class Ejercicio_A06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un año: ");
        int anioIngresado = input.nextInt();
        boolean esBisiesto = false;
        
        String mensaje = "El año " + anioIngresado + " no es bisiesto";
        
        if(anioIngresado % 400 == 0)
        {
            esBisiesto = true;
        }
        else if(anioIngresado % 100 == 0)
        {
            esBisiesto = false;
        }
        else if(anioIngresado % 4 == 0)
        {
            esBisiesto = true;
        }
        
        if(esBisiesto == true)
        {
            mensaje = "El año " + anioIngresado + " es bisiesto";
        }
        
        System.out.println(mensaje);
        input.close();
            
    }
    
}
