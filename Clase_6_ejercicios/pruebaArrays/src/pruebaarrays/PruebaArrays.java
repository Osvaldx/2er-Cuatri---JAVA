/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaarrays;

/**
 *
 * @author Nicolas
 */
public class PruebaArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MiClase[] vec2;
        
        vec2 = new MiClase[3];
        
        vec2[0] = new MiClase();
        vec2[1] = new MiClase();
        vec2[2] = new MiClase();
        
        vec2[0].valor = "hola";
        vec2[1].valor = "mundo";
        vec2[2].valor = "xd";
        
        vec2[2] = new MiClase();
        vec2[2].valor = "XD";
        
        vec2[0].mostrar();
        vec2[1].mostrar();
        vec2[2].mostrar();
    }
    
}
