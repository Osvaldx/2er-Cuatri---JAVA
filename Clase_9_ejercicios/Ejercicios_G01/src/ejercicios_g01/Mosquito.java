package ejercicios_g01;

public class Mosquito implements Volador{

    @Override
    public void despegar() {
        System.out.println("El Mosquito esta despegando.");
    }

    @Override
    public void aterrizar() {
        System.out.println("El Mosquito esta despegando.");
    }
    
    public void picar() {
        System.out.println("El Mosquisto esta picando");
    }
    
}
