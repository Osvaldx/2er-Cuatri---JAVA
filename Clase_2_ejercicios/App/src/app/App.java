/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;


/**
 *
 * @author Nicolas
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Datos datosUsuario = MiClase.pedirDatos();
        
        MiClase.mostrar(datosUsuario);
    }
    
}
