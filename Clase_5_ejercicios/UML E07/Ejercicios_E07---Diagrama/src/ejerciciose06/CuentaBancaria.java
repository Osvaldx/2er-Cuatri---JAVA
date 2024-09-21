package ejerciciose06;

import java.time.LocalDate;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class CuentaBancaria {
    
    private String titular;
    private String claveBancaria;
    private String tipoCaja;
    private int saldo;
    private LocalDate fechaApertura;
    private Domicilio domicilio;
    
    public CuentaBancaria(String titular,String claveBancaria, String tipoCaja, LocalDate fechaApertura, Domicilio domilicio) {
        this.titular = titular;
        this.claveBancaria = claveBancaria;
        this.tipoCaja = tipoCaja;
        this.saldo = 0;
        this.fechaApertura = fechaApertura;
        this.domicilio = domilicio;
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
    
    public int mostrarSaldo() {
        return this.saldo;
    }
    
    public void mostrarDatosCuenta() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("\n-----------------------------------\n");
        sb.append("Titular: " + this.titular + "\n");
        sb.append("CBU: " + this.claveBancaria + "\n");
        sb.append("Titpo de caja: " + this.tipoCaja + "\n");
        sb.append("Saldo: " + mostrarSaldo() + "\n");
        sb.append("Fecha apertura: " + this.fechaApertura);
        sb.append(this.domicilio.getDatosDomicilio());
        sb.append("\n-----------------------------------\n");
        
        System.out.println(sb.toString());
    }

}