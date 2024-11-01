package ejercicios_g01;

public class Helicoptero implements Volador{

    @Override
    public void despegar() {
        System.out.println("El Helicoptero esta despegando.");
    }

    @Override
    public void aterrizar() {
        System.out.println("El Helicoptero esta aterrizando.");
    }
    
}
