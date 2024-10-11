package modeloRomano.Nahuel;

import java.util.Objects;

public class Pasajero {

    private String apellido;
    private String nombre;
    private Rangos rango;

    public Pasajero() {
        this.apellido = "SIN APELLIDO";
        this.nombre = "SIN NOMBRE";
        this.rango = Rangos.CLIENTE;
    }

    public Pasajero(String apellido) {
        this();
        this.apellido = apellido;
    }

    public Pasajero(String apellido, String nombre) {
        this(apellido);
        this.nombre = nombre;
    }

    public Pasajero(String apellido, String nombre, Rangos rango) {
        this(apellido, nombre);
        this.rango = rango;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Rangos getRango() {
        return this.rango;
    }

    public static Boolean sonIguales(Pasajero pasajero1, Pasajero pasajero2) {
        boolean retorno = false;
        if((pasajero1.apellido.equals(pasajero2.apellido)) && (pasajero1.nombre.equals(pasajero2.nombre)) && (pasajero1.rango.equals(pasajero2.rango))) {
            retorno = true;
        }
        return retorno;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("APELLIDO: ").append(this.getApellido()).append("\n");
        sb.append("NOMBRE: ").append(this.getNombre()).append("\n");
        sb.append("RANGO: ").append(this.getRango()).append("\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object objeto) {
        boolean retorno = false;
        
        if(objeto instanceof Pasajero) {
            retorno = (this.apellido.equals(((Pasajero) objeto).apellido)) && (this.nombre.equals(((Pasajero) objeto).nombre));
        }
        
        return retorno;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.toString());
    }

}