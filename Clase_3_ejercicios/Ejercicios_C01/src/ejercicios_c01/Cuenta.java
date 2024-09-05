/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_c01;

/**
 *
 * @author Nicolas
 */
public class Cuenta {
    private String titular;
    private int cantidad;
    
    public Cuenta(String titular, int cantidad)
    {
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    public String getTitular()
    {
        return titular;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    public String mostrar()
    {
        return "El titular es " + this.titular + "el sueldo es: " + this.cantidad;
    }
    
    public void ingresar(int monto)
    {
        if(monto > 0)
        {
            this.cantidad += monto;
        }
    }
    
    public void retirar(int monto)
    {
        this.cantidad -= monto;
    }
    
    
}
