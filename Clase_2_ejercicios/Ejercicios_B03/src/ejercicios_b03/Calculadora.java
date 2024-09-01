/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_b03;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Calculadora {
    
    public static float Calcular(int primerNumero, int segundoNumero, String operacion)
    {
        float resultado = 0;
        while(true)
        {
            switch (operacion) {
            case "+":
                resultado = primerNumero + segundoNumero;
                break;
            case "-":
                resultado = primerNumero - segundoNumero;
                break;
            case "*":
                resultado = primerNumero * segundoNumero;
                break;
            case "/":
                if (Calculadora.Validar(segundoNumero) == true)
                {
                    resultado = (float) primerNumero / segundoNumero;
                    break;
                }
                else
                {
                    System.out.println("[!] ERROR, el segundo numero no puede ser 0");
                }
            default:
                System.out.println("[!] ERROR, ingrese una operacion valida!");
        
            }
            return resultado;
        }
    }
    
    private static boolean Validar(int segundoNumero)
    {
        return (segundoNumero != 0);
            
    }
    
    public static boolean ValidarS_N()
    {
        Scanner input = new Scanner(System.in);
        
        boolean retorno = false;
        boolean bandera = true;
        
        while (bandera)
        {
            System.out.println("¿Continuar? S/N");
            String continuar = input.nextLine();
            
            switch (continuar) 
            {
                case "S":
                    retorno = true;
                    bandera = false;
                    break;
                case "N":
                    retorno = false;
                    bandera = false;
                    break;
                default:
                    System.out.println("[!] ERROR, solo puede ingresar S/N");
                    break;
            }
        }
        return retorno;
    }
}
