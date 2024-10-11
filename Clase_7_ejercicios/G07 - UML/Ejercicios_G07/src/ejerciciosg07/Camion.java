package ejerciciosg07;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Camion extends Vehiculo {

    protected float tara;

    public Camion(String patente, Byte cantidadRuedas, Marcas marca, float tara) {
        super(patente, cantidadRuedas, marca);
        this.tara = tara;
    }

    protected String mostrarCamion() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.mostrar() + "\n");
        sb.append("- Tara: " + this.tara + "\n");
        
        return sb.toString();
    }

}