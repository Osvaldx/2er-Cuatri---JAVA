/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_a03;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Ejercicio_A03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // [A.03] Números primos
        // Mostrar por pantalla todos los números primos que haya hasta el número que ingrese el usuario por
        // 2 consola.
        // Nota: Utilizar estructuras repetitivas, selectivas y la función módulo (%).
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int numeroIngresado = input.nextInt();
        
        for(int i = 2; i <= numeroIngresado; i++)
        {
            boolean banderaEsPrimo = true;
            
            for(int j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                    banderaEsPrimo = false;
                    break;
                }
            }
            
            if(banderaEsPrimo == true)
            {
                System.out.println(i + " es primo");
            }
        }
        input.close();
        
    }
    
}
