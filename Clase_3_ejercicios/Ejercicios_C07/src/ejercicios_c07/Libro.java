/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_c07;

/**
 *
 * @author Nicolas
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private boolean disponible;
    
    public Libro(String titulo, String autor, boolean disponible)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean getDisponible() {
        return disponible;
    }
    
    public void mostrarInformacion()
    {
        String disponibilidad = "No";
        if(this.disponible == true)
        {
            disponibilidad = "Si";
        }
        
        String mensaje = "---------[INFORMACION LIBRO]---------" + "\n" +
                         "- Titulo: " + this.titulo + "\n" +
                         "- Autor: " + this.autor + "\n" +
                         "- Disponibilidad: " + disponibilidad + "\n" +
                         "-------------------------------------";
        
        System.out.println(mensaje);
    }
    
    public void prestar()
    {
        this.setDisponible(false);
    }
    
    public void devolver()
    {
        this.setDisponible(true);
    }
    
}
