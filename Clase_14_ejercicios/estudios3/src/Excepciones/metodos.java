/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;
import java.util.Scanner;
/**
 *
 * @author chave
 */
public class metodos {
    
    public static void validarEdad() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese su edad: ");
            int edad = Integer.parseInt(scanner.nextLine());

            if (edad < 0) {
                throw new IllegalArgumentException("La edad no puede ser negativa.");
            }

            System.out.println("Su edad es: " + edad);
        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un número válido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        } finally {
            scanner.close();
        }
    }
    
    public static void validarEdad2(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
    }
    
}
