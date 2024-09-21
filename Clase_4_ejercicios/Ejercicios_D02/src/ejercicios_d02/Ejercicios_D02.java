/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_d02;

/**
 *
 * @author Nicolas
 */
public class Ejercicios_D02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pruebas de la clase tinta
        
        Tinta tintaPrueba1 = new Tinta();
        Tinta tintaPrueba2 = new Tinta(Colores.Verde);
        Tinta tintaPrueba3 = new Tinta(Colores.Negro, Tipos.ConBrillito);
        
        System.out.println(Tinta.mostrar(tintaPrueba1));
        System.out.println("--------------------------");
        
        System.out.println(Tinta.mostrar(tintaPrueba2));
        System.out.println("--------------------------");
        
        System.out.println(Tinta.mostrar(tintaPrueba3));
        System.out.println("--------------------------");
        
        System.out.println(Tinta.sonIguales(tintaPrueba1, tintaPrueba2));
        System.out.println(Tinta.sonDistintos(tintaPrueba1, tintaPrueba3));
        System.out.println("*******************************************************************");
        
        // Pruebas de la clase pluma
        
        Pluma plumaPrueba1 = new Pluma();
        Pluma plumaPrueba2 = new Pluma("Lapix");
        Pluma plumaPrueba3 = new Pluma("Bic", tintaPrueba1);
        Pluma plumaPrueba4 = new Pluma("Ticz", tintaPrueba2, 10);
        
        
        System.out.println(plumaPrueba1.mostrar());
        System.out.println("--------------------------");
        System.out.println(plumaPrueba2.mostrar());
        System.out.println("--------------------------");
        System.out.println(plumaPrueba3.mostrar());
        System.out.println("--------------------------");
        System.out.println(plumaPrueba4.mostrar());
        
        System.out.println("--------------------------");
        System.out.println(Pluma.sonIguales(plumaPrueba4, tintaPrueba2)); // significa que ese objeto pluma tiene ese objeto tinta
        System.out.println(Pluma.sonDistintos(plumaPrueba4, tintaPrueba3));
        System.out.println("--------------------------");
        
        Pluma retorno = Pluma.addPluma(plumaPrueba4, tintaPrueba2); // suma +1 porque el objeto pluma4 tiene como tinta la tinta2 (true)
        System.out.println("[] AGREGAMOS 1 []");
        System.out.println(retorno.mostrar());
        
        System.out.println("--------------------------");
        System.out.println("[] RESTAMOS 1 []");
        Pluma retornoRemove = Pluma.removePluma(plumaPrueba3, tintaPrueba1);
        System.out.println(retornoRemove.mostrar());
        System.out.println("--------------------------");
        System.out.println("[] RESTAMOS 1 []");
        retornoRemove = Pluma.removePluma(plumaPrueba3, tintaPrueba1);
        System.out.println(retornoRemove.mostrar());
    }
    
}
