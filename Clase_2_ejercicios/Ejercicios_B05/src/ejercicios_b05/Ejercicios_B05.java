/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_b05;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Ejercicios_B05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // [B.05] - Aprendete las tablas
        // Crear una aplicación de consola que permita al usuario ingresar un número entero.
        // Desarrollar un método estático que reciba un número y devuelva la tabla de multiplicación de ese número en
        // formato String.
        // Mostrar en la consola el resultado.
        // Por ejemplo, si se ingresa el número 2 la salida deberá ser:
        // Tabla de multiplicar del número 2:
        // 2 x 1 = 2
        // 2 x 2 = 4
        // 2 x 3 = 6
        // 2 x 4 = 8
        // 2 x 5 = 10
        // 2 x 6 = 12
        // 2 x 7 = 14
        // 2 x 8 = 16
        // 2 x 9 = 18
        // Bonus: Utilizar la clase StringBuilder combinada con Strings interpolados para armar el resultado
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para ver su tabla de multiplicar: ");
        int numeroIngresado = input.nextInt();
        
        String tabla = MultiplicadoraTabla.ConstructorTabla(numeroIngresado);
        
        System.out.println(tabla);
        
        
        input.close();
    }
    
}
