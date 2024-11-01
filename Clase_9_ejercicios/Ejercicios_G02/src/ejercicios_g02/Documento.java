package ejercicios_g02;

public class Documento implements Imprimible{
    
    private String contenido;
    
    public Documento(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public void imprimible() {
        System.out.println("Documento: " + this.contenido);
    }
    
}
