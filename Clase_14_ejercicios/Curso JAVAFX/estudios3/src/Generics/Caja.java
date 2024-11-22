package generics;

public class Caja<T> {
    private T contenido;

    public void guardar(T item) {
        contenido = item;
    }

    public T obtener() {
        return contenido;
    }
}

// generics/Utilidades.java

