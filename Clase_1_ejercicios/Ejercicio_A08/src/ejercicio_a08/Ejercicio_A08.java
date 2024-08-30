/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_a08;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Ejercicio_A08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // [A.08] Recibos de sueldo
        // Por teclado se ingresa el valor hora, el nombre, la antigüedad (en años) y la cantidad de horas
        // trabajadas en el mes de N empleados de una fábrica.
        // Se pide calcular el importe a cobrar teniendo en cuenta que el total (que resulta de multiplicar el
        // valor hora por la cantidad de horas trabajadas), hay que sumarle la cantidad de años trabajados
        // multiplicados por $51000, y al total de todas esas operaciones restarle el 13% en concepto de
        // descuentos.
        // Mostrar el recibo correspondiente con el nombre, la antigüedad, el valor hora, el total a cobrar en
        // bruto, el total de descuentos y el valor neto a cobrar de todos los empleados ingresados.
        // Nota: Utilizar estructuras repetitivas y selectivas.
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el valor x hora: ");
        int valorXHora = input.nextInt();
        input.nextLine();
        
        System.out.print("Ingrese el nombre del empleado: ");
        String nombreEmpleado = input.nextLine();
        
        System.out.print("Ingrese la antiguedad (en años): ");
        int antiguedad = input.nextInt();
        
        System.out.print("Ingrese la cantidad de horas trabajadas x mes: ");
        int cantidadDeHorasTrabajadas = input.nextInt();
        
        int importeEnBruto = (valorXHora * cantidadDeHorasTrabajadas) + (antiguedad * 51000);
        int importeConDescuento = (int) (importeEnBruto * 0.13);
        int valorNetoACobrar = (importeEnBruto - importeConDescuento);
        
        String mensaje = "----------[RECIBO DE SUELDO]----------\n" +
                         "- Nombre empleado: " + nombreEmpleado + "\n" +
                         "- Valor x hora: " + valorXHora + "\n" +
                         "- Antiguedad: " + antiguedad + "\n" +
                         "- Cantidad hs trabajadas: " + cantidadDeHorasTrabajadas + "\n" +
                         "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                         "- Total a cobrar en bruto: " + importeEnBruto + "\n" +
                         "- Total a cobrar con descuento: " + importeConDescuento + "\n" +
                         "- Valor neto a cobrar " + valorNetoACobrar + "\n" +
                         "--------------------------------------";
        
        System.out.println(mensaje);
        input.close();
        
    }
    
}
