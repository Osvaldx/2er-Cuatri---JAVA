/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_b07;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Ejercicios_B07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //[B.07] - Calculadora de áreas
        //Realizar una clase llamada CalculadoraDeArea que posea tres métodos de clase (estáticos) que realicen el cálculo
        //del área que corresponda:
        //● public static double calcularAreaCuadrado(double longitudLado)
        //● public static double calcularAreaTriangulo(double base, double altura)
        //● public static double calcularAreaCirculo(double radio)
        //El ingreso de los datos como la visualización se deberán realizar desde el método main().
        
        Scanner input = new Scanner(System.in);
        boolean bandera = true;
        
        while (bandera)
        {
            System.out.println("Que desea calcular: \n- [1] Area de un Cuadrado \n- [2] Area de un Triangulo \n- [3] Area de un Circulo");
        
            String opcionIngresada = input.nextLine();

            switch (opcionIngresada)
            {
                case "1":
                    System.out.print("Ingrese el LADO del cuadrado: ");
                    double longitudLado = input.nextDouble();
                    double areaDelCuadrado = CalculadoraDeArea.calcularAreaCuadrado(longitudLado);
                    
                    System.out.println("El area del cuadrado es: " + areaDelCuadrado);
                    
                    bandera = false;
                    break;
                case "2":
                    System.out.print("Ingrese la BASE del triangulo: ");
                    double baseIngresada = input.nextDouble();
                    
                    System.out.print("Ingrese la ALTURA del triangulo: ");
                    double alturaIngresada = input.nextDouble();
                    
                    double areaDelTriangulo = CalculadoraDeArea.calcularAreaTriangulo(baseIngresada, alturaIngresada);
                    
                    System.out.println("El area del triangulo es: " + areaDelTriangulo);
                    
                    bandera = false;
                    break;
                case "3":
                    System.out.println("Ingrese el RADIO del circulo: ");
                    double radioIngresado = input.nextDouble();
                    
                    double areaDelCirculo = CalculadoraDeArea.calcularAreaCirculo(radioIngresado);
                    
                    System.out.println("El area del circulo es: " + areaDelCirculo);
                    
                    bandera = false;
                    break;
                default:
                    System.out.println("[!] ERROR, ingrese una opcion valida");
            }
        }
        input.close();
    }
    
}
