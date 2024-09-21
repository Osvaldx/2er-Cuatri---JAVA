package ejerciciose04;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class CuentaBancaria {

    private String claveBancaria;
    private String tipoCaja;
    private int saldo;
    
    public CuentaBancaria(String claveBancaria, String tipoCaja) {
        this.claveBancaria = claveBancaria;
        this.tipoCaja = tipoCaja;
        this.saldo = 0;
    }

    public int obtenerSaldo() {
        return this.saldo;
    }

    public void depositarDinero(int dinero) {
        this.saldo += dinero;
    }

    public void extraerDinero(int dinero) {
        this.saldo -= dinero;
        
        if(this.tipoCaja.equalsIgnoreCase("caja de ahorro") && this.saldo < 0) {
            this.saldo = 0;
        }
    }

    public String getUltimosDigitosCBU() {
        String ultimosDigitosCBU = "";
        String cbu = this.claveBancaria;
        
        for(int i = (cbu.length() - 3); i < cbu.length(); i++) {
            ultimosDigitosCBU += cbu.charAt(i);
        }
        
        return ultimosDigitosCBU;
    }
    
    public void mostrarSaldo() {
        System.out.println("---" + "Cuenta: " + this.claveBancaria + "---\n" +
                           "Saldo: " + obtenerSaldo() +
                           "\n------------------");
    }

}