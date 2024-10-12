package ejercicios_f04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Random;

public class Ejercicios_F04 {

    public static void main(String[] args) {
        ArrayList<Integer> listaArray = new ArrayList<>();
        Stack<Integer> listaStack = new Stack<>();
        Queue<Integer> listaQueue = new PriorityQueue<>();
        
        Random random = new Random();
        
        // este for itera hasta 20 y agrega los numeros random a las listas
        for(int i = 0; i < 20; i++) {
            listaArray.add(random.nextInt(-100,100));
            listaStack.add(random.nextInt(-100,100));
            listaQueue.add(random.nextInt(-100,100));
        }
        
        System.out.println("------------------------------------\n" + "   LISTA ARRAY:" + "\n------------------------------------");
        System.out.println("Ingreso: ");
        for(int numero : listaArray) {
            System.out.println(numero);
        }
        
        System.out.println("POSITIVOS ORDENADOS DE FORMA DECRECIENTE: ");
        Collections.sort(listaArray);
        for(int numero : listaArray) {
            System.out.println(numero);
        }
        System.out.println("NEGATIVOS ORDENADOS DE FORMA ASCENDIENTE: ");
        Collections.reverse(listaArray);
        for(int numero : listaArray) {
            System.out.println(numero);
        }
        
        System.out.println("------------------------------------");
        
        System.out.println("------------------------------------\n" + "   LISTA STACK:" + "\n------------------------------------");
        System.out.println("Ingreso: ");
        for(int numero : listaStack) {
            System.out.println(numero);
        }
        System.out.println("POSITIVOS ORDENADOS DE FORMA DECRECIENTE: ");
        Collections.sort(listaStack);
        for(int numero : listaStack) {
            System.out.println(numero);
        }
        System.out.println("NEGATIVOS ORDENADOS DE FORMA ASCENDIENTE: ");
        Collections.reverse(listaStack);
        for(int numero : listaStack) {
            System.out.println(numero);
        }
        System.out.println("------------------------------------");
        
        System.out.println("------------------------------------\n" + "   LISTA QUEUE:" + "\n------------------------------------");
        System.out.println("Ingreso: ");
        for(int numero : listaQueue) {
            System.out.println(numero);
        }
        System.out.println("POSITIVOS ORDENADOS DE FORMA DECRECIENTE: ");
        ArrayList<Integer> listaQueueL = new ArrayList<>(listaQueue);
        
        Collections.sort(listaQueueL);
        for(int numero : listaQueue) {
            System.out.println(numero);
        }
        System.out.println("NEGATIVOS ORDENADOS DE FORMA ASCENDIENTE: ");
        Collections.reverse(listaQueueL);
        for(int numero : listaQueue) {
            System.out.println(numero);
        }
        System.out.println("------------------------------------");
        
        
        
    }
    
}
