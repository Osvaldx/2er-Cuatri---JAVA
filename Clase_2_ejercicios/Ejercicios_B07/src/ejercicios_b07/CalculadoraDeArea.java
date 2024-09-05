/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_b07;

/**
 *
 * @author Nicolas
 */
public class CalculadoraDeArea {
    
    public static double calcularAreaCuadrado(double longitudLado)
    {
        double areaDelCuadrado = Math.pow(longitudLado, 2);
        
        return areaDelCuadrado;
    }
    
    public static double calcularAreaTriangulo(double base, double altura)
    {
        double areaDelTriangulo = ((base * altura) / 2);
        
        return areaDelTriangulo;
    }
    
    public static double calcularAreaCirculo(double radio)
    {
        double areaDelCirculo = Math.pow(radio, 2) * Math.PI;
        
        return areaDelCirculo;
    }
    
}
