package romano.nahuel;

import java.io.Serializable;

public class Producto implements Comparable<Producto>, Serializable{
    
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String codigoBarra;
    private Categoria categoria;
    private double precio;

    public Producto(String nombre, String codigoBarra, Categoria categoria, double precio) {
        this.nombre = nombre;
        this.codigoBarra = codigoBarra;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public int compareTo(Producto o) {
        return this.nombre.compareTo(o.getNombre());
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", codigoBarra=" + codigoBarra + ", categoria=" + categoria + ", precio=" + precio + '}';
    }
    
}
