/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_c04;

/**
 *
 * @author Nicolas
 */
public class Ejercicios_C04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Romano", "Nahuel", "116663");
        Estudiante estudiante2 = new Estudiante("Ivo", "Saja", "116670");
        Estudiante estudiante3 = new Estudiante("Matias", "Vargados", "116692");
        
        estudiante1.setNotaPrimerParcial(9);
        estudiante1.setNotaSegundoParcial(7);
        
        estudiante2.setNotaPrimerParcial(8);
        estudiante2.setNotaSegundoParcial(9);
        
        estudiante3.setNotaPrimerParcial(4);
        estudiante3.setNotaSegundoParcial(3);
        
        System.out.println(estudiante1.mostrar());
        System.out.println(estudiante2.mostrar());
        System.out.println(estudiante3.mostrar());
    }
    
}
