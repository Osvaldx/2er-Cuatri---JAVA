package ejerciciosg02;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Archivo {

    private String nombre;
    private int peso;
    private String localizacion;
    private Boolean estadoArchivo;

    public Archivo(String nombre, int peso, String localizacion, Boolean estadoArchivo) {
        this.nombre = nombre;
        this.peso = peso;
        this.localizacion = localizacion;
        this.estadoArchivo = estadoArchivo;
    }

    public void abrirArchivo() {
        this.estadoArchivo = true;
        System.out.println("[!] Se abrio el archivo!");
    }

    public void cerrarArchivo() {
        this.estadoArchivo = false;
        System.out.println("[!] Se cerro el archivo!");
    }

    public String moverArchivo(String directorio) {
        StringBuilder sb = new StringBuilder();
        this.localizacion = directorio;
        
        sb.append("[!] Se movio el archivo a " + directorio);
        return sb.toString();
    }

}