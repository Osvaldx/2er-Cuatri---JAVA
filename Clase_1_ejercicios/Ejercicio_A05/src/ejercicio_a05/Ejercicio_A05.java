/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_a05;

import java.util.Scanner;

/**
 *
 * @author Nahuel
 */
public class Ejercicio_A05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // [A.05] Centros Numéricos
        // Un centro numérico es un número que separa una lista de números enteros (comenzando en 1) en
        // dos grupos de números, cuyas sumas son iguales.
        // El primer centro numérico es el 6, el cual separa la lista (1 a 8) en los grupos: (1; 2; 3; 4; 5) y (7; 8) cuyas
        // sumas son ambas iguales a 15. El segundo centro numérico es el 35, el cual separa la lista (1 a 49) en
        // los grupos: (1 a 34) y (36 a 49) cuyas sumas son ambas iguales a 595.
        // Se pide elaborar una aplicación que calcule los centros numéricos entre 1 y el número que el usuario
        // ingrese por consola.
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int numeroIngresado = input.nextInt();
        
        int primerGrupo = 0;
        int segundoGrupo = 0;
        String primerGrupoNumeros = "";
        String segundoGrupoNumeros = "";
        
        String mensaje = "El numero " + numeroIngresado + " NO ES UN NUMERO CENTRAL";
        
        for(int i = 1; i < numeroIngresado; i++)
        {
            primerGrupo += i;
            if(i == 1)
            {
                primerGrupoNumeros += i;
            }
            else
            {
                primerGrupoNumeros += " + " + i;
            }
        }
        
        for(int j = numeroIngresado + 1; segundoGrupo < primerGrupo; j++)
        {
            segundoGrupo += j;
            
            if(j == numeroIngresado + 1)
            {
                segundoGrupoNumeros += j;
            }
            else
            {
                segundoGrupoNumeros += " + " + j;
            }
        }
        
        if(primerGrupo == segundoGrupo)
        {
            mensaje = "El numero " + numeroIngresado + " ES UN NUMERO CENTRAL!" +
                      "\n-----------------------" +
                      "\n- Numeros primer grupo: " + primerGrupoNumeros + " = " + primerGrupo +
                      "\n-----------------------" +
                      "\n- Numeros segundo grupo: " + segundoGrupoNumeros + " = " + segundoGrupo +
                      "\n-----------------------";
            
        }
        
        System.out.println(mensaje);
        input.close();

    }
    
}