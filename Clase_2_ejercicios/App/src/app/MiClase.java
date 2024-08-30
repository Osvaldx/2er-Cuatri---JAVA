/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */

class Datos {
    String nombre;
    int edad;
    
    public Datos(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }

}
public class MiClase {
    public static int edad;
    public static String nombre;
    
    public static Datos pedirDatos()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        MiClase.nombre = input.nextLine();
        
        System.out.print("Ingrese su edad: ");
        MiClase.edad = input.nextInt();
        
        input.close();
        return new Datos(nombre, edad);
    }
    
    public static void mostrar(Datos datoUsuario)
    {
        System.out.println("Su nombre es " + datoUsuario.nombre + " su edad es " + datoUsuario.edad);
    }
}
