package ejercicios_k01;

public class Ejercicios_K01 {

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        try {
            System.out.println(c.dividir(0,0));
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("cierre de app");
        }
    }
}
