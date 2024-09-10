/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_c07;

/**
 *
 * @author Nicolas
 */
public class Ejercicios_C07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libro HarryPotter = new Libro("Harry Potter - La piedra filosofal", "Juani Ushua", false);
        Libro EternoAmor = new Libro("Un Amor ETERNO", "Ivo Saja", true);
        
        HarryPotter.mostrarInformacion();
        EternoAmor.mostrarInformacion();
        
        System.out.println("---------------------------\n- SE PRESTO EL LIBRO ACA \n---------------------------");
        HarryPotter.prestar();
        HarryPotter.mostrarInformacion();
        
        System.out.println("---------------------------\n- SE DEVOLVIO EL LIBRO ACA \n---------------------------");
        HarryPotter.devolver();
        HarryPotter.mostrarInformacion();
        
        Lector lector1 = new Lector("Nahuel");
        
        lector1.tomarPrestado(EternoAmor);
        lector1.mostrarInformacion();
        EternoAmor.mostrarInformacion();
        
        System.out.println("---------- SE DEVOLVIO EL LIBRO1!!---------------");
        
        lector1.devolverLibro(EternoAmor);
        lector1.mostrarInformacion();
        EternoAmor.mostrarInformacion();
        
        
    }
    
}
