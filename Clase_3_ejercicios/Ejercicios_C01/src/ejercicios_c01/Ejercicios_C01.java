/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_c01;

/**
 *
 * @author Nicolas
 */
public class Ejercicios_C01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // [C.01] - Creo que necesito un préstamo
        // Crear una aplicación de consola que contenga la clase Cuenta.
        // Deberá tener los atributos:
        // ● titular que contendrá la razón social del titular de la cuenta.
        // ● cantidad que será un número decimal que representa al monto actual de dinero en la cuenta.
        // Construir los siguientes métodos para la clase:
        // ● Un constructor que permita inicializar todos los atributos.
        // ● Un método getter para cada atributo.
        // ● mostrar retornará una cadena de texto con todos los datos de la cuenta.
        // ● ingresar recibirá un monto para acreditar a la cuenta. Si el monto ingresado es negativo, no se hará
        // nada.
        // ● retirar recibirá un monto para debitar de la cuenta. La cuenta puede quedar en negativo.
        // En el método main, simular depósitos y extracciones de dinero de la cuenta, e ir mostrando como va variando
        // el saldo.
        
        Cuenta cuentaUno = new Cuenta("Juani", 100);
        
        System.out.println(cuentaUno.mostrar());
        
        cuentaUno.ingresar(200000);
        
        System.out.println(cuentaUno.mostrar());
        
        cuentaUno.retirar(300000);
        
        System.out.println(cuentaUno.mostrar());
    }
    
}
