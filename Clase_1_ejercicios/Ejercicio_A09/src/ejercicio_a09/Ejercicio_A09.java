/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_a09;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Ejercicio_A09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // [A.09] Dibujando un triángulo rectángulo
        // Escribir un programa que imprima por pantalla una pirámide como la siguiente:
        // *
        // ***
        // *****
        // *******
        // *********
        // El usuario indicará cuál será la altura de la pirámide ingresando un número entero positivo. Para el
        // ejemplo anterior la altura ingresada fue de 5.
        // Nota: Utilizar estructuras repetitivas y selectivas.
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int numeroIngresado = input.nextInt();
        String linea = "";
        
        for(int i = 1; i < numeroIngresado; i++)
        {
            for(int j = i; j <= 2 * i - 1; j++)
            {
                linea += "*";
            }
            
            System.out.println(linea);
        }
    }
    
}
