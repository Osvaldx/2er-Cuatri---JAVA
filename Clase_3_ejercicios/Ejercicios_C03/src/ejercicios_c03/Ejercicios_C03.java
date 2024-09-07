/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_c03;

/**
 *
 * @author Nicolas
 */
public class Ejercicios_C03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona persona1 = new Persona("Nahuel", "24/09/2004", 46210110);
        Persona persona2 = new Persona("Ivo", "13/12/2005", 47119897);
        Persona persona3 = new Persona("Carlito", "15/04/2008", 12345678);
        
        System.out.println(persona1.mostrar());
        System.out.println(persona2.mostrar());
        System.out.println(persona3.mostrar());
    }
    
}
