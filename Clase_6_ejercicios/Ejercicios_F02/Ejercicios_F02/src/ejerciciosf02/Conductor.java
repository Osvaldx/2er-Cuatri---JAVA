package ejerciciosf02;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Conductor {

    private String nombre;
    private int[] kilometrosRecorridos;

    public Conductor(String nombre, int[] lista) {
        this.nombre = nombre;
        this.kilometrosRecorridos = lista;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public int[] getListaKilometros() {
        return this.kilometrosRecorridos;
    }

    public int getDiaKilometros(int numero) {
        return this.kilometrosRecorridos[numero];
    }

}