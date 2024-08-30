/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_a02;

import java.util.Scanner;

/**
 *
 * @author Nahuel
 */
public class Ejercicio_A02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // [A.02] Potencias
        // Ingresar un número y mostrar: el cuadrado y el cubo del mismo.
        // Se debe validar que el número sea mayor que cero, caso contrario, mostrar el mensaje:
        // "ERROR.
        // ¡Reingresar número!".
        // Nota: Utilizar el método ‘pow’ de la clase Math para realizar la operación.
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int numeroIngresado = input.nextInt();
        
        int numeroAlCuadrado = (int) Math.pow(numeroIngresado, 2);
        int numeroAlCubo = (int) Math.pow(numeroIngresado, 3);
        
        String mensaje = "El numero ingresado fue: " + numeroIngresado + "\n" +
                         numeroIngresado + " al cuadrado es: " + numeroAlCuadrado + "\n" +
                         numeroIngresado + " al cubo es: " + numeroAlCubo;
        
        System.out.println(mensaje);
        input.close();
        
    }
    
}
