package ejerciciosg01;

public class VehiculoTerrestre {

    private short cantidadRuedas;
    private short cantidadPuertas;
    private Colores color;

    public VehiculoTerrestre(short cantidadRuedas, short cantidadPuertas, Colores color) {
        this.cantidadRuedas = cantidadRuedas;
        this.cantidadPuertas = cantidadPuertas;
        this.color = color;
    }
    
    public String mostrarDatos() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("- Cantidad Ruedas: " + this.cantidadRuedas);
        sb.append("- Cantidad Puertas: " + this.cantidadPuertas);
        sb.append("- Color: " + this.color);
        
        return sb.toString();
    }

}