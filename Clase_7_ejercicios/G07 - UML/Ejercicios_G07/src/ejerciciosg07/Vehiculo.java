package ejerciciosg07;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Vehiculo {

    protected String patente;
    protected Byte cantidadRuedas;
    protected Marcas marca;

    public Vehiculo(String patente, Byte cantidadRuedas, Marcas marca) {
        this.patente = patente;
        this.cantidadRuedas = cantidadRuedas;
        this.marca = marca;
    }

    public String getPatente() {
        return this.patente;
    }

    public Marcas getTipoMarca() {
        return this.marca;
    }

    protected String mostrar() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("- Patente: " + this.patente + "\n");
        sb.append("- Cantidad Ruedas: " + this.cantidadRuedas + "\n");
        sb.append("- Marca: " + this.marca + "\n");
        
        return sb.toString();
    }

    public static Boolean sonIguales(Vehiculo vehiculo1, Vehiculo vehiculo2) {
        boolean retorno = false;
        
        if(vehiculo1.getPatente().equals(vehiculo2.getPatente()) || vehiculo1.getTipoMarca().equals(vehiculo2.getTipoMarca())) {
            retorno = true;
        }
        
        return retorno;
    }

}