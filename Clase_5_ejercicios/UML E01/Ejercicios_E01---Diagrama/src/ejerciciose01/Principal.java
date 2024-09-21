package ejerciciose01;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        Persona persona1 = new Persona("saja", "ivo", 2005);
        Persona persona2 = new Persona("romano", "nahuel", 2004);
        
        System.out.println(persona1.mostrarInformacion());
        System.out.println(persona1.validacionMayorEdad());
        
        persona2.setNombre("Nicolas");
        persona2.setApellido("Pastik");
        
        System.out.println(persona2.mostrarInformacion());
    }

}