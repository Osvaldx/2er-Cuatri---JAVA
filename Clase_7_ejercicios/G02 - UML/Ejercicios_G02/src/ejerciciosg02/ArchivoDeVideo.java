package ejerciciosg02;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ArchivoDeVideo extends ArchivoMultimedia {

    private TipoVideo formato;
    private int alto;
    private int ancho;

    public ArchivoDeVideo(String nombre, int peso, String localizacion, Boolean estadoArchivo, int duracion, Boolean estadoMultimedia, TipoVideo formato, int alto, int ancho) {
        super(nombre, peso, localizacion, estadoArchivo, duracion, estadoMultimedia);
        this.formato = formato;
        this.alto = alto;
        this.ancho = ancho;
    }

}