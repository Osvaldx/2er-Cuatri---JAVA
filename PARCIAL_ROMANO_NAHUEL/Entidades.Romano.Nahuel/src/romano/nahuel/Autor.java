package romano.nahuel;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Autor {

    private String nombre;
    private String apellido;

    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public static Boolean sonIguales(Autor autor1, Autor autor2) {
        return autor1.getNombreApellido().equals(autor2.getNombreApellido());
    }

    public String getNombreApellido() {
        return this.nombre + " - " + this.apellido;
    }

}