package ejerciciose06;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Domicilio {

    private String calle;
    private int altura;
    private String barrio;

    public Domicilio(String calle, int altura, String barrio) {
        this.calle = calle;
        this.altura = altura;
        this.barrio = barrio;
    }

    public String getDatosDomicilio() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("\n");
        sb.append("Calle: " + this.barrio + "\n");
        sb.append("Altura: " + this.altura + "\n");
        sb.append("Barrio: " + this.barrio + "\n");
        
        return sb.toString();
    }

}