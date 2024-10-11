/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebascode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author Nicolas
 */
public class PruebasCode {

    public static void main(String[] args) {
        
        Random objetoRandom = new Random();
        ArrayList<Integer> listInt = new ArrayList<>();
        
        for(int i = 0; i < 20; i++){
            int numeroRandom = objetoRandom.nextInt(-50, 31);
            if(numeroRandom != 0){
                listInt.add(numeroRandom);
            }
        }
        
        for(int numero : listInt){
            System.out.println(numero);
        }
        
    }
    
}
