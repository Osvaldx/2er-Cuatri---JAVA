package ejerciciosg01;

public class Camion extends VehiculoTerrestre {

    private short cantidadMarchas;
    private int pesoCarga;

    public Camion(short cantidadRuedas, short cantidadPuertas, Colores color, short cantidadMarchas, int pesoCarga) {
        super(cantidadRuedas,cantidadPuertas,color);
        this.cantidadMarchas = cantidadMarchas;
        this.pesoCarga = pesoCarga;
    }
    
    public void mostrar() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.mostrarDatos());
        sb.append("- Cantidad Marchas: " + this.cantidadMarchas);
        sb.append("- Peso Carga: " + this.pesoCarga);
        
        System.out.println(sb);
    }

}