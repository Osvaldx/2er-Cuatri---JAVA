package ejerciciosg02;

import java.util.Base64;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ArchivoTexto extends Archivo {

    private String codificacion;

    public ArchivoTexto(String nombre, int peso, String localizacion, Boolean estadoArchivo, String codificacion) {
        super(nombre, peso, localizacion, estadoArchivo);
        this.codificacion = codificacion;
    }

    public String cifrarContenido() {
        StringBuilder sb = new StringBuilder();
        String cifrado = this.codificacion;
        
        this.codificacion = Base64.getEncoder().encodeToString(cifrado.getBytes());
        
        sb.append("[!] El contenido se a encriptado: " + this.codificacion);
        return sb.toString();
    }
    
    public String descrifrarContenido() {
        StringBuilder sb = new StringBuilder();
        String cifrado = this.codificacion;
        
        byte[] decodeado = Base64.getDecoder().decode(cifrado);
        this.codificacion = new String(decodeado);
        
        sb.append("[!] El cotenido se a desencriptado: " + this.codificacion);
        return sb.toString();
    }

}