package ejerciciosg01;

public class Moto extends VehiculoTerrestre {

    private short cilindrada;

    public Moto(short cantidadRuedas, short cantidadPuertas, Colores color, short cilindrada) {
        super(cantidadRuedas,cantidadPuertas,color);
        this.cilindrada = cilindrada;
    }
    
    public void mostrar() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.mostrarDatos());
        sb.append("- Cilindrada: " + this.cilindrada);
        
        System.out.println(sb);
    }

}