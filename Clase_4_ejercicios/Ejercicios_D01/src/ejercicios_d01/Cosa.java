/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_d01;

import java.time.LocalDate;

/**
 *
 * @author Nicolas
 */
public class Cosa {
    
    private int entero;
    private String cadena;
    private LocalDate fecha;
    
    public void establecerValor(int entero)
    {
        this.entero = entero;
    }
    
    public void establecerValor(String cadena)
    {
        this.cadena = cadena;
    }
    
    public void establecerValor(LocalDate fecha)
    {
        this.fecha = fecha;
    }
    
    public String mostrar()
    {
        String retorno = "";
        
        retorno += this.entero + "-";
        retorno += this.cadena + "-";
        retorno += this.fecha;
        
        return retorno;
    }
    
    public static String mostrar(Cosa cosa)
    {
        return cosa.mostrar();
    }
    
}
