/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_b08;

/**
 *
 * @author Nicolas
 */
public class CalculadoraLongitud {
    
    public static double TecnicaPitagoras(double base, double longitud)
    {
        double longitudDeHipotenusa = Math.sqrt((Math.pow(base, 2) + Math.pow(longitud, 2)));
        
        return longitudDeHipotenusa;
    }
    
}
