package ejercicios_g03;

public class Empleado implements Pagable {
    private String nombre;
    private int sueldo;
    
    public Empleado(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    @Override
    public void pagar(int monto) {
        this.sueldo += monto;
        System.out.println("Se le pago a " + this.nombre + " $" + monto + " Sueldo total: " + this.sueldo);
    }
    
    
}
