package ejerciciosg07;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Moto extends Vehiculo {

    protected float cilindrada;

    public Moto(String patente, Byte cantidadRuedas, Marcas marca, float cilindrada) {
        super(patente, cantidadRuedas, marca);
        this.cilindrada = cilindrada;
    }

    protected String mostrarMoto() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.mostrar() + "\n");
        sb.append("- Cilindrada: " + this.cilindrada + "\n");
        
        return sb.toString();
    }

}