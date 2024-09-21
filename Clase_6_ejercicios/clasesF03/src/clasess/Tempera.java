package clasess;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Tempera {

    private Color color;
    private String marca;
    private int cantidad;

    public Tempera(Color tipoColor, String marca, int cantidad) {
        this.color = tipoColor;
        this.marca = marca;
        this.cantidad = cantidad;
    }

    private String mostrar() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Color: ").append(this.color);
        sb.append("Marca: ").append(this.marca);
        sb.append("Cantidad: ").append(this.cantidad);
        
        return sb.toString();
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public static String mostrar(Tempera tempera) {
        return tempera.mostrar();
    }

    public static boolean sonIguales(Tempera tempera1, Tempera tempera2) {
        boolean retorno = false;
        if(tempera1.color.equals(tempera2.color) || tempera1.marca.equals(tempera2.marca)) {
            retorno = true;
        }
        
        return retorno;
    }

    public static boolean sonDistintos(Tempera tempera1, Tempera tempera2) {
        return !Tempera.sonIguales(tempera1, tempera2);
    }

    public static Tempera add(Tempera tempera1, double cantidadRecibida) {
        tempera1.cantidad += cantidadRecibida;
        return tempera1;
    }

}