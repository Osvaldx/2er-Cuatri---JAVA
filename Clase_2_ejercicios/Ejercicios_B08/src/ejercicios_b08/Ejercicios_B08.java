/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_b08;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Ejercicios_B08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //[B.08] - Pitágoras estaría orgulloso
        //Crear una aplicación de consola que pida al usuario ingresar la base y la altura de un triángulo en centímetros.
        //El programa deberá calcular la longitud de la hipotenusa aplicando el teorema de pitágoras y usar los métodos pow
        //y sqrt de la clase Math para realizar los cálculos.
        //Mostrar el resultado en la consola.
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese la BASE del triangulo: ");
        double baseIngresada = input.nextDouble();
        
        System.out.print("Ingrese la ALTURA del triangulo: ");
        double alturaIngresada = input.nextDouble();
        
        double longitudDeHipotenusa = CalculadoraLongitud.TecnicaPitagoras(baseIngresada, alturaIngresada);
        
        System.out.println("La longitud de la hipotenusa es: " + longitudDeHipotenusa);
        
        input.close();

    }
    
}
