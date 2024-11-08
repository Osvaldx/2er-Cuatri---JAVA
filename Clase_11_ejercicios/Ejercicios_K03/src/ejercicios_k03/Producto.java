package ejercicios_k03;

public class Producto {
    private String nombre;
    private int cantidad;
    private double precio;
    
    public Producto(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public int getCantidad() {
        return this.cantidad;
    }
    
    public double getPrecio() {
        return this.precio;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCantidad(int cantidad) throws CantidadInvalidaException{
        if(cantidad < 0) {
            throw new CantidadInvalidaException("[!] Error la cantidad no puede ser negativa");
        }
        this.cantidad = cantidad;
    }
    
    public void setPrecio(double precio) throws PrecioInvalidoException{
        if(precio < 0) {
            throw new PrecioInvalidoException("[!] Error el precio no puede ser negativo");
        }
        this.precio = precio;
    }
    
    public void reabastecer(int cantidad) throws CantidadInvalidaException{
        if(cantidad < 0) {
            throw new CantidadInvalidaException("[!] Error la cantidad no puede ser negativa");
        }
        this.cantidad += cantidad;
    }
}
