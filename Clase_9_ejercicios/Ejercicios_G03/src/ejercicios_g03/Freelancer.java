package ejercicios_g03;

public class Freelancer implements Pagable {
    private String nombre;
    private int sueldo;
    private int horasTrabajadas;
    
    public Freelancer(String n, int s, int hs) {
        this.nombre = n;
        this.sueldo =  s;
        this.horasTrabajadas = hs;
    }

    @Override
    public void pagar(int monto) {
        int sueldoPagar = monto * this.horasTrabajadas;
        this.sueldo += sueldoPagar;
        
        System.out.println("Se le pago al Freelancer " + this.nombre + " $" + sueldoPagar + " Sueldo total: " + this.sueldo);
    }
    
    
}
