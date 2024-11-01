package ejercicios_g01;

public class Avion implements Volador{

    @Override
    public void despegar() {
        System.out.println("El Avion esta despegando.");
    }

    @Override
    public void aterrizar() {
        System.out.println("El Avion esta aterrizando.");
    }
    
}
