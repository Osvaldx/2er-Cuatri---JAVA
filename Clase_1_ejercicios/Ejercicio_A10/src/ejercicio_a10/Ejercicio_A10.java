/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_a10;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Ejercicio_A10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // [A.10] Dibujando un triángulo equilátero
        // Partiendo de la base del ejercicio anterior, se pide realizar un programa que imprima por pantalla
        // una pirámide como la siguiente:
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        // Nota: Utilizar estructuras repetitivas y selectivas.
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int numeroIngresado = input.nextInt();
        
        for(int i = 1; i <= numeroIngresado; i++)
        {
            String linea = "";
            
            for(int j = i; j < numeroIngresado; j++)
            {
                linea += " ";
            }
            
            for(int k = 1; k <= 2 * i - 1; k++)
            {
                linea += "*";
            }
            
            System.out.println(linea);
        }
        
    }
    
}
