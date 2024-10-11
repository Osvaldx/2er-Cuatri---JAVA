package ejerciciosg02;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ArchivoDeAudio extends ArchivoMultimedia {

    private TipoAudio formato;
    private String artista;
    private String album;

    public ArchivoDeAudio(String nombre, int peso, String localizacion, Boolean estadoArchivo, int duracion, Boolean estadoMultimedia, TipoAudio formato, String artista, String album) {
        super(nombre, peso, localizacion, estadoArchivo, duracion, estadoMultimedia);
        this.formato = formato;
        this.artista = artista;
        this.album = album;
    }

}