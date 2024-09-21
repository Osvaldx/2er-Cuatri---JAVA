package ejerciciose03;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        UTNbot utnbot = new UTNbot("MichiUTN");
        
        Persona persona1 = new Persona("Ivo", 1123542323);
        Persona persona2 = new Persona("Keru", 1133303995);
        
        System.out.println("------");
        utnbot.saludar();
        System.out.println("------");
        
        System.out.println("------");
        utnbot.saludar(persona1);
        System.out.println("------");
        utnbot.saludar(persona2);
        
    }

}