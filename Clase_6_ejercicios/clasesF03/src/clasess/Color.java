package clasess;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public enum Color {

    ROJO("Rojo"),
    BLANCO("Blanco"),
    AZUL("Azul"),
    VERDE("Verde"),
    NEGRO("Negro");
    private String tipoColor;

    Color(String color) {
        this.tipoColor = color;
    }

    public String getColor() {
        return this.tipoColor;
    }

}