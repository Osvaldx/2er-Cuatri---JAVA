package ejerciciose09;

import java.time.LocalDate;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Documento {

    private String titulo;
    private LocalDate fecha;
    private String cuerpo;
    
    public Documento(String titulo, LocalDate fecha, String cuerpo) {
    this.titulo = titulo;
    this.fecha = fecha;
    this.cuerpo = cuerpo;
}

    public String getTitulo() {
        return this.titulo;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public String getCuerpo() {
        return this.cuerpo;
    }

}