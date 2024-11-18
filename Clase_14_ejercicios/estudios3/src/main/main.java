/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import Excepciones.metodos;
import generics.Caja;
import generics.Utilidades;
import generics.Par;
import java.util.Scanner;

/**
 *
 * @author chave
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Ejemplo usando la clase Caja
        System.out.println("----------GENERICS----------");
        Caja<String> caja = new Caja<>();
        caja.guardar("Contenido genérico");
        
        Caja<Integer> caja2 = new Caja<>();
        caja2.guardar(3);
        
        System.out.println("Contenido de la caja: " + caja.obtener());
        
        
        System.out.println("----------------------------");
        
        
        // Ejemplo de método genérico
        Integer[] numeros = {1, 2, 3, 4};
        String[] letras = {"a", "b", "c", "d"};
        Utilidades.imprimirArray(letras);
        
        
        System.out.println("----------------------------");
        
        
        // Ejemplo usando la clase Par
        Par<String, Integer> par = new Par<>("Edad", 42);
        System.out.println("Clave: " + par.getClave() + ", Valor: " + par.getValor());
        System.out.println("----------------------------");
        
        //metodos.validarEdad();
        
       
        int edad = 562222;
        try {
            metodos.validarEdad2(edad);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        } finally {
            System.out.println("Su edad es: " + edad);
        }
    }
    
}
