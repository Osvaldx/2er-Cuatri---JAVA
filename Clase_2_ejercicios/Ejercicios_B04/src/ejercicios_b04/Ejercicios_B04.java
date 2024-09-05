/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_b04;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Ejercicios_B04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //[B.04] - Conversor numérico
        //Desarrollar una clase llamada Conversora, que posea dos métodos de clase (estáticos):
        //● String decimalBinario(double). Convierte un número de decimal a binario.
        //● double binarioDecimal(String). Convierte un número binario a decimal.
        
        Scanner input = new Scanner(System.in);
        boolean bandera = true;
        
        while (bandera)
        {
            System.out.println("Que desea realizar: \n- [A] pasar Decimal a Binario \n- [B] pasar Binario a Decimal");
            String opcionIngresada = input.nextLine();
            
            switch (opcionIngresada)
            {
                case "A":
                    System.out.println("Ingrese un numero Decimal para pasarlo a Binario: ");
                    int numeroDecimal = input.nextInt();
                    input.nextLine();
                    
                    String resultadoBinario = Conversora.decimalBinario(numeroDecimal);

                    System.out.println("El resultado es: " + resultadoBinario);
                    bandera = false;
                    break;
                    
                case "B":
                    System.out.println("Ingrese un numero Binario para pasarlo a Decimal: ");
                    String numeroBinario = input.nextLine();
                    
                    int resultadoDecimal = Conversora.binarioDecimal(numeroBinario);
                    
                    System.out.println("El resultado es: " + resultadoDecimal);
                    bandera = false;
                    break;
                    
                default:
                    System.out.println("Ingrese una opcion correcta! A o B");
            }
            
        }
        input.close();
        
    }
    
}
