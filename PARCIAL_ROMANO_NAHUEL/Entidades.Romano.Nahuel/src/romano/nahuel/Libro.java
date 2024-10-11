package romano.nahuel;

import java.util.Random;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class Libro {

    protected Autor autor;
    protected int cantidadDePaginas;
    protected String titulo;
    protected float precio;
    protected static Random generadorDePaginas;
    
    static {
        generadorDePaginas = new Random();
    }

    public Libro(String titulo, Float precio, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.autor = autor;
        this.cantidadDePaginas = 0;
    }

    public Libro(String titulo, Float precio, String nombre, String apellido) {
        this(titulo, precio, new Autor(nombre,apellido));
    }

    public int getCantidadDePaginas() {
        if(this.cantidadDePaginas == 0) {
            this.cantidadDePaginas = generadorDePaginas.nextInt(832) + 31;
        }
        return this.cantidadDePaginas;
    }

    public float getPrecio() {
        return this.precio;
    }

    private static String mostrar(Libro libro1) {
        StringBuilder sb = new StringBuilder();
        sb.append(" ").append("\n");
        sb.append("AUTOR: ").append(libro1.autor.getNombreApellido()).append("\n");
        sb.append("TITULO: ").append(libro1.titulo).append("\n");
        sb.append("CANT. PAGINAS: ").append(libro1.getCantidadDePaginas()).append("\n");
        sb.append("PRECIO: ").append(libro1.getPrecio()).append("\n");
        return sb.toString();
    }

    public static Boolean sonIguales(Libro libro1, Libro libro2) {
        return (libro1.autor.getNombreApellido().equals(libro2.autor.getNombreApellido())) && (libro1.titulo.equals(libro2.titulo));
    }
    
    @Override
    public boolean equals(Object o) {
        boolean retorno = false;
        
        if(o instanceof Libro) {
            retorno = Libro.sonIguales(((Libro) o), this);
        }
        
        return retorno;
    }

    @Override
    public String toString() {
        return Libro.mostrar(this);
    }

}