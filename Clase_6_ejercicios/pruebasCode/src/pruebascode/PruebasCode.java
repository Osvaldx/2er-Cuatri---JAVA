/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebascode;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Nicolas
 */
public class PruebasCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] lista_numeros = {1000,1200,900,100};
        
        int index = 0;
        for(int numero : lista_numeros) {
            if(numero > index) {
                index = numero;
            }
        }
        
        System.out.println("Mayor: " + index);
        
    }
    
}
