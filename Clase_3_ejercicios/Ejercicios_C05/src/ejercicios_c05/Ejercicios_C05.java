/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_c05;

import ClasesBoligrafos.Boligrafo;

/**
 *
 * @author Nicolas
 */
public class Ejercicios_C05 {

    public static void main(String[] args) {
        // TODO code application logic here
        Boligrafo boligrafoAzul = new Boligrafo("Magenta", (short) 100);
        Boligrafo boligrafoRojo = new Boligrafo("Rojo", (short) 50);
        
        String mensajeBoligrafoAzul = "--------[BOLIGRAFO " + boligrafoAzul.getColor() + "]--------\n" +
                                      "- Se pinto: " + boligrafoAzul.pintar((short) -5) + "\n" +
                                      "- Tinta: " + boligrafoAzul.getTinta() + "\n" +
                                      "- Color de tinta: " + boligrafoAzul.getColor() + "\n";
        System.out.println(mensajeBoligrafoAzul);
        boligrafoAzul.recargar();
        System.out.println("[!] SE RECARGO Y QUEDO: " + boligrafoAzul.getTinta());
        
        
        String mensajeBoligrafoRojo = "--------[BOLIGRAFO " + boligrafoRojo.getColor() + "]--------\n" +
                                      "- Se pinto: " + boligrafoRojo.pintar((short) -2) + "\n" +
                                      "- Tinta: " + boligrafoRojo.getTinta() + "\n" +
                                      "- Color de tinta: " + boligrafoRojo.getColor() + "\n";
        
        System.out.println(mensajeBoligrafoRojo);
        boligrafoRojo.recargar();
        System.out.println("[!] SE RECARGO Y QUEDO: " + boligrafoRojo.getTinta());
    }
    
}
