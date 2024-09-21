package ejerciciose06;

import java.time.LocalDate;
import java.time.Month;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        LocalDate fechaApertura1 = LocalDate.of(1990, 4, 6);
        Domicilio domicilioCompartido = new Domicilio("Av. Siempreviva", 742,"Campo primaveral");
        LocalDate fechaApertura2 = LocalDate.of(1990, 1, 9);
        
        CuentaBancaria persona1 = new CuentaBancaria("Juan Pérez", "000000067125756243311", "Caja de ahorro", fechaApertura1, domicilioCompartido);
        CuentaBancaria persona2 = new CuentaBancaria("María Fernández", "000000056723112356733", "Cuenta corriente", fechaApertura2, domicilioCompartido);
        
        persona1.depositarDinero(1200000);
        persona2.depositarDinero(4500000);
        
        System.out.println("Ultimos 3 digitos CBU: " + persona1.getUltimosDigitosCBU());
        
        
        persona1.mostrarDatosCuenta();
        persona2.mostrarDatosCuenta();
    }

}