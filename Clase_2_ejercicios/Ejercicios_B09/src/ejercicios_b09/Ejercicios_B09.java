/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_b09;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Ejercicios_B09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //[B.09] - El tiempo pasa...
        //Crear un método estático que reciba una fecha y calcule el número de días que pasaron desde esa fecha hasta la
        //fecha actual. Tener en cuenta los años bisiestos.
        //Pedir por consola la fecha de nacimiento de una persona (día, mes y año) y calcule el número de días vividos por
        //esa persona hasta la fecha actual utilizando el método desarrollado anteriormente.
        //Ayudarse con las funcionalidades del tipo LocalDateTime para resolver el ejercicio.
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese su fecha de nacimiento con este formato dia/mes/año: ");
        String fechaIngresada = input.nextLine();
        
        long diasVividos = ElTiempoPasa.CalcularDiasVividos(fechaIngresada);
        
        System.out.println("Usted lleva " + diasVividos + " dias vividos");
    }
    
}
