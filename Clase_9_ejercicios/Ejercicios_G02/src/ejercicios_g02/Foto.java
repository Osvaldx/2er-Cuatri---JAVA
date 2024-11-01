package ejercicios_g02;

public class Foto implements Imprimible{
    
    private String nombre;
    
    public Foto(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void imprimible() {
        System.out.println("Foto: " + this.nombre);
    }
    
}
