/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_b05;

/**
 *
 * @author Nicolas
 */
public class MultiplicadoraTabla {
    
    public static String ConstructorTabla(int numero)
    {
        StringBuilder tabla = new StringBuilder();
        
        for(int i = 1; i <= 10; i++)
        {
            tabla.append(numero);
            tabla.append(" x ");
            tabla.append(i);
            tabla.append(" = ");
            tabla.append(numero * i);
            tabla.append("\n");
        }
        
        String tablaString = tabla.toString();
        
        return tablaString;
    }
    
}
