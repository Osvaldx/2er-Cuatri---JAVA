/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_b09;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Nicolas
 */
public class ElTiempoPasa {
    
    public static long CalcularDiasVividos(String fechaIngresada)
    {
        String[] fechaDividida = fechaIngresada.split("/");
        LocalDate diaActual = LocalDate.now();
        
        int dia = Integer.parseInt(fechaDividida[0]);
        int mes = Integer.parseInt(fechaDividida[1]);
        int anio = Integer.parseInt(fechaDividida[2]);
        
        LocalDate fechaParseada = LocalDate.of(anio, mes, dia);
        
        return ChronoUnit.DAYS.between(fechaParseada, diaActual);
    
    }
    
}
