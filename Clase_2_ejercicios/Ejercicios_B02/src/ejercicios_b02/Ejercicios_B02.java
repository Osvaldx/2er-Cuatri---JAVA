/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_b02;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Ejercicios_B02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // [B.02] - Validadora
        // Realizar un programa que sume números enteros hasta que el usuario lo determine, por medio de un mensaje
        // “¿Continua? (S/N)”.
        // En el método estático validarS_N() de la clase ValidarRespuesta, se validará el ingreso de opciones.
        // El método NO recibe parámetros y devuelve un valor de tipo booleano, true si se ingresó una “S” y false si se
        // ingresó una “N”.
        // El método deberá validar si otro caracter fue ingresado mostrando un mensaje de error y pidiendo el reingreso del
        // mismo.
        
        Scanner input = new Scanner(System.in);
        int sumaNumeros = 0;
        boolean bandera = true;
        
        while (bandera)
        {
            System.out.println("Ingrese un numero para sumar: ");
            int numeroIngresado = input.nextInt();
            input.nextLine();
            sumaNumeros += numeroIngresado;
            System.out.println("Se agrego el numero " + numeroIngresado);
            
            boolean opcionValidada = ValidarRespuesta.validarS_N();
            
            if(opcionValidada == false)
            {
                bandera = false;
            }
        }
        System.out.println("Resultado de la suma total: " + sumaNumeros);
        input.close();

    }
    
}
