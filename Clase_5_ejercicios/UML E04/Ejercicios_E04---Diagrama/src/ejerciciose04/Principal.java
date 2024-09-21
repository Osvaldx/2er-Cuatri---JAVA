package ejerciciose04;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        CuentaBancaria cbu1 = new CuentaBancaria("00000462123457234", "Cuenta de ahorro");
        CuentaBancaria cbu2 = new CuentaBancaria("00000546711234561", "Cuenta corriente");
        
        cbu1.depositarDinero(1300000);
        cbu2.depositarDinero(2500000);
        
        cbu1.mostrarSaldo();
        System.out.println("RETIRANDO DINERO!!");
        cbu1.extraerDinero(1500000);
        cbu1.mostrarSaldo();
        
        System.out.println("---------------\n" +
                           "Ultimos 3 digitos CBU: " + cbu1.getUltimosDigitosCBU());
        
        System.out.println("---------------------------------------------");
        
        cbu2.mostrarSaldo();
        System.out.println("RETIRANDO DINERO!!");
        cbu2.extraerDinero(3600000);
        cbu2.mostrarSaldo();
        
        System.out.println("---------------\n" +
                           "Ultimos 3 digitos CBU: " + cbu2.getUltimosDigitosCBU());
    }

}