package ejerciciose06;

import java.time.LocalDate;
import java.time.Month;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        LocalDate fecha_nacimientoPersona1 = LocalDate.of(2005, 12, 02);
        Domicilio domicilioPersona1 = new Domicilio("Rivadavia", 1322, "Lanus");
        Persona persona1 = new Persona("saja", "ivo", fecha_nacimientoPersona1, domicilioPersona1);
        
        LocalDate fecha_nacimientoPersona2 = LocalDate.of(2004, 9, 24);
        Domicilio domicilioPersona2 = new Domicilio("Flores", 1561, "Quilmes");
        Persona persona2 = new Persona("romano", "nahuel", fecha_nacimientoPersona2, domicilioPersona2);
        
        System.out.println(persona1.mostrarInformacion());
        System.out.println(persona1.validacionMayorEdad());
        
        persona2.setNombre("Nicolas");
        persona2.setApellido("Pastik");
        
        System.out.println(persona2.mostrarInformacion());
    }

}