/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_b04;

/**
 *
 * @author Nicolas
 */
public class Conversora {
    
    public static String decimalBinario(int numero)
    {
        String resultado = "";
        int residuo;
        
        while(numero > 0)
        {
            residuo = (int) (numero % 2);
            resultado = residuo + resultado;
            numero = numero / 2;
        }
        
        return resultado;
    }
    
    public static int binarioDecimal(String numero)
    {
        int resultado = 0;
        boolean primerCalculo = false;
        
        int longitudCadena = numero.length();
        
        for(int i = 0; i < longitudCadena; i++)
        {
            int numeroIndice = numero.charAt(i) - '0';
            int potencia = longitudCadena -1 -i;
            
            resultado += numeroIndice * Math.pow(2,potencia);
        }
        
        return resultado;
        
    }
    
}
