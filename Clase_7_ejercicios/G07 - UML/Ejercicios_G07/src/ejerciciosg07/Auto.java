package ejerciciosg07;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Auto extends Vehiculo {

    protected int cantidadAsientos;

    public Auto(String patente, Byte cantidadRuedas, Marcas marca, int cantidadAsientos) {
        super(patente, cantidadRuedas, marca);
        this.cantidadAsientos = cantidadAsientos;
    }

    protected String mostrarAuto() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.mostrar() + "\n");
        sb.append("- Cantidad Asientos: " + this.cantidadAsientos + "\n");
        
        return sb.toString();
    }

}