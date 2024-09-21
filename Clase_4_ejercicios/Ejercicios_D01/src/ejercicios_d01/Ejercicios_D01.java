/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_d01;

import java.time.LocalDate;

/**
 *
 * @author Nicolas
 */
public class Ejercicios_D01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cosa cosa1 = new Cosa();
        
        cosa1.establecerValor(20);
        cosa1.establecerValor("Nahuel");
        
        LocalDate fecha = LocalDate.of(2024, 9, 24);
        
        cosa1.establecerValor(fecha);
        
        System.out.println(cosa1.mostrar(cosa1));
    }
    
}
