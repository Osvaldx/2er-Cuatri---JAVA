/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_b01;

/**
 *
 * @author Nicolas
 */
public class Validadora {
    
    public static boolean validar(int valor, int min, int max)
    {
        boolean validacion = false;
        
        if(min <= valor && valor <= max)
        {
            validacion = true;
        }
        
        return validacion;
    }
    
}
