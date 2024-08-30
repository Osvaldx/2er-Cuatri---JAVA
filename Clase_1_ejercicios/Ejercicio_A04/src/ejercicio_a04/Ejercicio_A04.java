/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_a04;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Ejercicio_A04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // [A.04] Números perfectos
        // Un número perfecto es un entero positivo, que es igual a la suma de todos los enteros positivos
        // (excluido 3 el mismo) que son divisores del número.
        // El primer número perfecto es 6, ya que los divisores de 6 son 1, 2 y 3; y 1 + 2 + 3 = 6.
        // Escribir una aplicación que encuentre los 4 primeros números perfectos.
        // Nota: Utilizar estructuras repetitivas y selectivas.
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int numeroIngresado = input.nextInt();
        int sumaDivisores = 0;
        
        String mensaje = "El numero " + numeroIngresado + " NO ES UN NUMERO PERFECTO!";
        
        for(int i = 1; i < numeroIngresado; i++)
        {
            
            if(numeroIngresado % i == 0)
            {
                sumaDivisores += i;
            }
        }
        
        if(numeroIngresado == sumaDivisores)
        {
            mensaje = "El numero " + numeroIngresado + " es un numero PERFECTO!";
        }
        
        System.out.println(mensaje);
        input.close();

    }
    
}