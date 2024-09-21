package ejerciciose03;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class UTNbot {

    private String nombreBot;

    public UTNbot(String nombreBot) {
        this.nombreBot = nombreBot;
    }

    public void saludar() {
        System.out.println("Hola, mi nombre es " + this.nombreBot + " ¿En qué puedo ayudarte?");
    }

    public void saludar(Persona persona) {
        System.out.println("Hola " + persona.getNombre() + " mi nombre es " + this.nombreBot + " ¿En qué puedo ayudarte?");
    }

}