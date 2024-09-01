/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_b02;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class ValidarRespuesta {
    
    public static boolean validarS_N()
    {
        Scanner input = new Scanner(System.in);
        boolean bandera = true;
        boolean opcionValidada = false;
        
        while (bandera)
        {
            System.out.println("¿Continuar? S/N");
            String opcionIngresada = input.nextLine();
            
            switch (opcionIngresada) {
                case "S":
                    opcionValidada = true;
                    bandera = false;
                    break;
                case "N":
                    opcionValidada = false;
                    bandera = false;
                    break;
                default:
                    System.out.println("[!] ERROR, solo puede ingresar S/N");
                    break;
            }
            
        }
        return opcionValidada;
    }
    
}
