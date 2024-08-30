/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_b01;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Ejercicios_B01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // [B.01] - Validador de rangos
        // Realizar una clase llamada Validadora que posea un método estático llamado validar con la siguiente firma:
        // boolean validar(int valor, int min, int max)
        // ● valor: dato a validar.
        // ● min: mínimo valor incluido.
        // ● max: máximo valor incluido.
        // Pedir al usuario que ingrese 10 números enteros. Validar con el método desarrollado anteriormente que estén
        // dentro del rango -100 y 100.
        // Terminado el ingreso mostrar el valor mínimo ingresado, valor máximo ingresado y el promedio.
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el numero del rango maximo: ");
        int numeroMax = input.nextInt();
        
        System.out.print("Ingrese el numero del rango minimo: ");
        int numeroMin = input.nextInt();
        
        System.out.println("Ingrese 10 numeros enteros: ");
        int sumaNumeros = 0;
        int numeroMinIngresado = 0;
        int numeroMaxIngresado = 0;
        int contadorVueltas = 0;
        boolean valoresEstablecidos = false;
        
        while(contadorVueltas < 10)
        {
            int numeroIngresado = input.nextInt();
            boolean validacion = Validadora.validar(numeroIngresado, numeroMin, numeroMax);
            String mensaje = "El numero " + numeroIngresado + " NO esta dentro del rango";
        
            if(validacion == true)
            {
                mensaje = "El numero " + numeroIngresado +" SI esta dentro del rango!";
                if(valoresEstablecidos == false)
                {
                    numeroMinIngresado = numeroIngresado;
                    numeroMaxIngresado = numeroIngresado;
                    valoresEstablecidos = true;
                }
                else if(numeroIngresado > numeroMaxIngresado)
                {
                    numeroMaxIngresado = numeroIngresado;
                }
                else if(numeroIngresado < numeroMinIngresado)
                {
                    numeroMinIngresado = numeroIngresado;
                }
                System.out.println(mensaje);
                sumaNumeros += numeroIngresado;
                contadorVueltas += 1;
            }
            else
            {
                System.out.println(mensaje);
                continue;
            }
        }
        int promedioNumeros = sumaNumeros / 10;
        System.out.println("el numero maximo ingresado fue: " + numeroMaxIngresado + "\nel numero minimo ingresado fue: " + numeroMinIngresado + "\nel promedio de los 10 numeros es: " + promedioNumeros);
        input.close();
        
    }
    
}
