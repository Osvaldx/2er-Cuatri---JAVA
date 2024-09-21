package clasess;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Paleta {

    private Tempera[] colores;
    private int cantidadMaximaColores;

    public Paleta(int cantidadIngresada) {
        this.cantidadMaximaColores = cantidadIngresada;
    }

    public String mostrar() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("La paleta tiene una cantidad maxima de colores de: ").append(this.cantidadMaximaColores).append(" y sus temperas son: ");
        for(Tempera color : this.colores) {
            sb.append("---------------------\n").append(Tempera.mostrar(color)).append("\n---------------------");
        };
        
        return sb.toString();
    }

    private int obtenerIndice() {
        int retorno = -1;
        
        for(int i = 0; i < colores.length; i++) {
            if(colores[i] == null) {
                retorno = i;
                break;
            }
        }
        
        return retorno;
    }

    private int obtenerIndice(Tempera tempera) {
        int retorno = -1;
        
        for(int i = 0; i < colores.length; i++) {
            if(colores[i].equals(tempera)) {
                retorno = i;
                break;
            }
        }
        
        return retorno;
    }

    public static Boolean sonIguales(Paleta paleta1, Tempera tempera2) {
        return paleta1.obtenerIndice(tempera2) != -1;
    }

    public static Boolean sonDistintos(Paleta paleta1, Tempera tempera2) {
        return !Paleta.sonIguales(paleta1, tempera2);
    }

    public static Paleta add(Paleta paleta1, Tempera tempera2) {
        int indice = paleta1.obtenerIndice(tempera2);
        
        if(indice != -1) {
            Tempera.add(tempera2, 1);
        }
        else {
            int index = paleta1.obtenerIndice();
            paleta1.colores[index] = tempera2;
        }
        
        return paleta1;
    }

    public static Paleta add(Paleta paleta1, Paleta paleta2) {
        Paleta paletaNueva = new Paleta(paleta1.cantidadMaximaColores + paleta2.cantidadMaximaColores);
        
        for(Tempera color : paleta1.colores) {
            if(color != null) {
                Paleta.add(paletaNueva, color);
            }
        }
        
        for(Tempera color : paleta2.colores) {
            if(color != null) {
                Paleta.add(paleta2, color);
            }
        }
        
        return paletaNueva;
    }

    public static Paleta remove(Paleta paleta1, Tempera tempera2) {
        int indice = paleta1.obtenerIndice(tempera2);
        
        if(indice != -1) {
            Tempera.add(tempera2, -1);
            if(tempera2.getCantidad() <= 0) {
                paleta1.colores[indice] = null;
            }
        }
        
        return null;
    }

}