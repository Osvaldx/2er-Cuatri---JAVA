package ejerciciosg02;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ArchivoMultimedia extends Archivo {

    private int duracion;
    private Boolean estadoMultimedia;

    public ArchivoMultimedia(String nombre, int peso, String localizacion, Boolean estadoArchivo, int duracion, Boolean estadoMultimedia) {
        super(nombre, peso, localizacion, estadoArchivo);
        this.duracion = duracion;
        this.estadoMultimedia = estadoMultimedia;
    }

    public String reproducir() {
        StringBuilder sb = new StringBuilder();
        this.estadoMultimedia = true;
        
        sb.append("[!] Se esta reproduciendo el archivo");
        return sb.toString();
    }

    public String dejarReproducir() {
        StringBuilder sb = new StringBuilder();
        this.estadoMultimedia = false;
        
        sb.append("[!] Se dejo de reproducir el archivo");
        return sb.toString();
    }

}