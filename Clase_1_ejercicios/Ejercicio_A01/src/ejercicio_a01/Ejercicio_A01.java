/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_a01;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Ejercicio_A01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        [A.01] Máximos, mínimos y promedios
//        Ingresar 5 números por consola, guardandolos en una variable escalar.
//        Calcular y mostrar: el valor máximo, el valor mínimo y el promedio.
//        Nota: utilizar estructuras repetitivas.

        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese 5 numeros: ");
        int numeroMaximo = 0;
        int numeroMinimo = 0;
        
        for(int i = 0; i < 5; i++)
        {
            
            int Numero_Ingresado = input.nextInt();
            
            if(i == 0)
            {
                numeroMaximo = Numero_Ingresado;
                numeroMinimo = Numero_Ingresado;
                
            }
            else if(Numero_Ingresado > numeroMaximo)
            {
                numeroMaximo = Numero_Ingresado;
            }
            else if(Numero_Ingresado < numeroMinimo)
            {
                numeroMinimo = Numero_Ingresado;
            }
            
        }
        System.out.println("El numero maximo es: " + numeroMaximo + "\nEl numero minimo es: " + numeroMinimo);
        input.close();
    }
    
}
