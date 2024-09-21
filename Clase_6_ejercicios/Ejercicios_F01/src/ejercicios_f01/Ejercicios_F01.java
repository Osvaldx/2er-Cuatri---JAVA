/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_f01;

import java.util.Arrays;
import java.util.Random;
import java.util.Collections;

/**
 *
 * @author Nicolas
 */
public class Ejercicios_F01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Integer[] listaNumerosRandom = new Integer[20];
        Random random = new Random();
        
        for(int i = 0; i < 20; i++) {
            listaNumerosRandom[i] = random.nextInt(-50,50);
        }
        
        System.out.println("------------------------------\nLista Numeros random:\n------------------------------");
        for(int numero : listaNumerosRandom) {
            System.out.println(numero + ",");
        }
        
        System.out.println("------------------------------\nLista Numeros ORDENADA ASCENDIENTE: \n------------------------------");
        Arrays.sort(listaNumerosRandom, Collections.reverseOrder());
        
        for(int numero : listaNumerosRandom) {
            if(numero > 0) {
                System.out.println(numero + ",");
            }
        }
        
        System.out.println("------------------------------\nLista Numeros ORDENADA DESCENDIENTE:\n------------------------------");
        Arrays.sort(listaNumerosRandom);
        
        for(int numero : listaNumerosRandom) {
            if(numero < 0) {
                System.out.println(numero + ",");
            }
        }
    }
    
}
