/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_b03;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Ejercicios_B03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // [B.03] - La calculadora
        // Realizar un programa que permita realizar operaciones matemáticas simples (suma, resta, multiplicación y división).

        // Crear una clase llamada Calculadora que posea dos métodos estáticos (de clase):

        // calcular (público): Recibirá tres parámetros, el primer parámetro será el primer operando, el segundo parámetro
        // será el segundo operando y el tercer y último parámetro será la operación matemática a realizar. El método
        // devolverá el resultado de dicha operación.

        // validar (privado): Recibirá como parámetro al segundo operando de la función calcular. Este método se debe utilizar
        // sólo cuando la operación elegida sea la DIVISIÓN. Este método devolverá true si el operando es distinto de cero,
        // false caso contrario.

        // Se le debe pedir al usuario que ingrese dos números y la operación que desea realizar (ingresando el caracter +, -, *, o /).
        // El usuario decidirá cuándo finalizar el programa.
        
        Scanner input = new Scanner(System.in);
        
        while (true)
        {
            System.out.println("Ingrese el primer numero: ");
            int primerNumero = input.nextInt();
            
            System.out.println("Ingrese el segundo numero: ");
            int segundoNumero = input.nextInt();
            input.nextLine();
            
            System.out.println("Ingrese la operacion a realizar: \n- [+] \n- [-] \n- [*] \n- [/]");
            String operacion = input.nextLine();
            
            float resultado = Calculadora.Calcular(primerNumero, segundoNumero, operacion);
            
            if(resultado != 0)
            {
                String mensaje = "El resultado es: " + resultado;
                System.out.println(mensaje);
            }
            
            if(Calculadora.ValidarS_N() == false)
            {
                break;
            }
        }
        input.close();
        
    }
    
}
