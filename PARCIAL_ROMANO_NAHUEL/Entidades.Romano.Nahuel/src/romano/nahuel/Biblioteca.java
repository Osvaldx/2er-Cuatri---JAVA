package romano.nahuel;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Biblioteca {

    private int capacidadMaxima;
    private ArrayList<Libro> Libros;

    public Biblioteca() {
        this.Libros = new ArrayList<>();
        this.capacidadMaxima = 3;
    }

    public Biblioteca(int capacidad) {
        this();
        this.capacidadMaxima = capacidad;
    }

    public Boolean sonIguales(Libro libro1) {
        return this.Libros.contains(libro1);
    }

    public void agregar(Libro libro1) {
        if(this.Libros.size() < this.capacidadMaxima){
            if(!this.sonIguales(libro1)){
                this.Libros.add(libro1);
            }
            else{
                System.out.println("El libro ya esta en la biblioteca!!");
            }
        }
        else{
            System.out.println("No hay mas lugar en la biblioteca!!");
        }
    }

    private float getPrecio(PrecioLibro preciolibro1) {
        float precio = 0;

        if (preciolibro1 == PrecioLibro.MANUALES) {
            precio = (float) this.getPrecioDeManuales();
        } 
        else if (preciolibro1 == PrecioLibro.NOVELAS) {
            precio = (float) this.getPrecioDeNovelas();
        } 
        else if (preciolibro1 == PrecioLibro.TODOS) {
            precio = (float) this.getPrecioTotal();
        }

        return precio;
    }

    public double getPrecioDeManuales() {
        double precioTotal = 0.0;
        
        for(Libro libro1 : this.Libros) {
            if(libro1 instanceof Manual) {
                precioTotal += ((Manual) libro1).precio;
            }
        }
        
        return precioTotal;
    }

    public double getPrecioDeNovelas() {
        double precioTotal = 0.0;
        
        for(Libro libro1 : this.Libros) {
            if(libro1 instanceof Novela) {
                precioTotal += ((Novela) libro1).precio;
            }
        }
        
        return precioTotal;
    }

    public double getPrecioTotal() {
        double precioManual = this.getPrecioDeManuales();
        double precioNovela = this.getPrecioDeNovelas();
        
        double precioTotal = precioManual + precioNovela;
        
        return precioTotal;
    }

    public static String mostrar(Biblioteca biblioteca1) {
        StringBuilder sb = new StringBuilder();
        sb.append("Capacidad: ").append(biblioteca1.capacidadMaxima).append("\n");
        sb.append("Total por manuales: ").append(biblioteca1.getPrecioDeManuales()).append("\n");
        sb.append("Total por novelas: ").append(biblioteca1.getPrecioDeNovelas()).append("\n");
        sb.append("Total: ").append(biblioteca1.getPrecioTotal()).append("\n");
        sb.append("************************").append("\nListado de libros").append("\n").append("************************").append("\n");
        for(Libro libro : biblioteca1.Libros) {
            sb.append(libro.toString()).append("\n");
        }
        return sb.toString();
    }

}