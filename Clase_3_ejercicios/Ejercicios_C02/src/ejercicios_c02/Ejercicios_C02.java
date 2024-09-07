/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_c02;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Ejercicios_C02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Adivinadora adivinadora = new Adivinadora();
        Scanner input = new Scanner(System.in);
        
        boolean banderabucle = true;
        int maxIntentos = 0;
        
        while (banderabucle)
        {
            String mensajeMenu = "-------[BIENVENIDO ADIVINA EL NUMERO]-------\n" +
                             "Que dificultad desea jugar?:\n" +
                             "- [A] Facil\n" +
                             "- [B] Media\n" +
                             "- [C] Dificil";

            System.out.println(mensajeMenu);
            String opcionDificultad = input.nextLine();

            switch (opcionDificultad)
            {
                case "A":
                    maxIntentos = 0;
                    banderabucle = false;
                    break;
                case "B":
                    maxIntentos = 50;
                    banderabucle = false;
                    break;
                case "C":
                    maxIntentos = 10;
                    banderabucle = false;
                    break;
                default:
                    System.out.println("[!] ERROR, ingrese una opcion valida");
            }
        }
        
        System.out.println("-----[ADIVINA EL NUMERO CRACK!]-----");
        
        boolean bandera = true;
        while (bandera)
        {
            System.out.print("Ingrese un numero: ");
            int numeroIngresado = input.nextInt();
            String mensaje = adivinadora.Adivinar(numeroIngresado, maxIntentos);
            switch (mensaje)
            {
                case "Mayor":
                    System.out.println("El número " + numeroIngresado + " es mayor al número secreto!");
                    System.out.println("Intentos restantes: " + (maxIntentos - adivinadora.GetIntentos()));
                    break;
                case "Menor":
                    System.out.println("El número " + numeroIngresado + " es menor al número secreto!");
                    System.out.println("Intentos restantes: " + (maxIntentos - adivinadora.GetIntentos()));
                    break;
                case "Igual":
                    System.out.println("Ganaste!! El número " + numeroIngresado + " lo adivinaste en " + adivinadora.GetIntentos() + " intentos!!!");
                    bandera = false;
                    break;
                case "NO QUEDAN INTENTOS":
                    System.out.println("NO QUEDAN MAS INTENTOS PERDISTE!");
                    bandera = false;
                    break;
            }
        }

    }
    
}
