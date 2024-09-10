/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_c06;

import Geometria.Punto;
import Geometria.Rectangulo;

/**
 *
 * @author Nicolas
 */
public class Ejercicios_C06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto vertice1 = new Punto(2,5);
        Punto vertice3 = new Punto(8,12);
        
        Rectangulo rectangulo = new Rectangulo(vertice1, vertice3);
        
        mostrarDatos(rectangulo);
    }
    
    public static void mostrarDatos(Rectangulo rectangulo)
    {
        System.out.println("Vertice 1: " + rectangulo.getVertice1().getX() + ", " + rectangulo.getVertice1().getY());
        System.out.println("Vertice 2: " + rectangulo.getVertice2().getX() + ", " + rectangulo.getVertice2().getY());
        System.out.println("Vertice 3: " + rectangulo.getVertice3().getX() + ", " + rectangulo.getVertice3().getY());
        System.out.println("Vertice 4: " + rectangulo.getVertice4().getX() + ", " + rectangulo.getVertice4().getY());
        System.out.println("Area: " + rectangulo.area());
        System.out.println("Perimetro: " + rectangulo.perimetro());
    }
    
}
