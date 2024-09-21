package ejerciciose02;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        EstadoCivil estadoCivilEmpleado1 = EstadoCivil.CASADO;
        Empleado empleado1 = new Empleado(47119897, "Ivo", "Saja", 340000, estadoCivilEmpleado1.getValor(), 2);
        
        System.out.println(empleado1.mostrarInformacion());
        
        EstadoCivil estadoCivilEmpleado2 = EstadoCivil.SOLTERO;
        Empleado empleado2 = new Empleado(12345678, "Pedro", "Penx", 340000, estadoCivilEmpleado2.getValor(), 2);
        
        System.out.println(empleado2.mostrarInformacion());
        
    }

}