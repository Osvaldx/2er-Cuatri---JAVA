/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_a07;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author Nahuel
 */
public class Ejercicio_A07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Hacer un programa que pida por pantalla la fecha de nacimiento de una persona (día, mes y año) y calcule
        // el número de días vividos por esa persona hasta la fecha actual (tomar la fecha del sistema con
        // LocalDateTime.now()).
        // Nota: Utilizar estructuras selectivas. Tener en cuenta los años bisiestos.
        
        System.out.println("Ingrese su fecha de nacimiento con el siguiente formato\n- dia/mes/año ");
        Scanner input = new Scanner(System.in);
        
        String fecha_ingresada = input.nextLine();
        String[] fecha_dividida = fecha_ingresada.split("/");
        LocalDate dia_actual = LocalDate.now();
        
        int dia = Integer.parseInt(fecha_dividida[0]);
        int mes = Integer.parseInt(fecha_dividida[1]);
        int anio = Integer.parseInt(fecha_dividida[2]);
        
        LocalDate fecha_parseada = LocalDate.of(anio, mes, dia);
        
        long dias_vividos = ChronoUnit.DAYS.between(fecha_parseada, dia_actual);
        
        System.out.println("Usted lleva " + dias_vividos + " dias vividos");
        
        input.close();
    }
    
}
