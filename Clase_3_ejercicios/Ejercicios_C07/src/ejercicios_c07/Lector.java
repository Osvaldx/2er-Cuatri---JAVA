/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_c07;

/**
 *
 * @author Nicolas
 */
public class Lector {
    
    private String nombre;
    private Libro libroPrestado;
    
    public Lector(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void tomarPrestado(Libro libroRecibido)
    {
        if(libroRecibido.getDisponible() == true)
        {
            this.libroPrestado = libroRecibido;
            libroRecibido.prestar();
        }
    }
    
    public void devolverLibro(Libro libroRecibido)
    {
        if(libroRecibido.getDisponible() == false)
        {
            libroRecibido.setDisponible(true);
            this.libroPrestado = null;
        }
    }
    
    public void mostrarInformacion()
    {
        String tituloLibro = "";
        
        if(this.libroPrestado != null)
        {
            tituloLibro = this.libroPrestado.getTitulo();
        }
        else
        {
            tituloLibro = "No tiene ningun libro";
        }
        
        String mensaje = "---------[INFORMACION LECTOR]---------" + "\n" +
                         "- Lector: " + this.nombre + "\n" +
                         "- Libro: " + tituloLibro + "\n" +
                         "--------------------------------------";
        
        System.out.println(mensaje);
    }
}
