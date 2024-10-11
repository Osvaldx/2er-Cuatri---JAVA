package ejerciciosg01;

public class Automovil extends VehiculoTerrestre {

    private short cantidadMarchas;
    private int cantidadPasajeros;

    public Automovil(short cantidadRuedas, short cantidadPuertas, Colores color, short cantidadMarchas, int cantidadPasajeros) {
        super(cantidadRuedas,cantidadPuertas,color);
        this.cantidadMarchas = cantidadMarchas;
        this.cantidadPasajeros = cantidadPasajeros;
    }
    
    public void mostrar() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.mostrarDatos());
        sb.append("- Cantidad Marchas: " + this.cantidadMarchas);
        sb.append("- Cantidad de Pasajeros: " + this.cantidadPasajeros);
        
        System.out.println(sb);
    }

}