package ejerciciose05;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        Password contrasena1 = new Password("Mierda123@");
        Password contrasena2 = new Password("1234");
        Password contrasena3 = new Password();
        
        // validamos si la contraseña es fuerte o no
        System.out.println("Es fuerte: " + contrasena1.esFuerte());
        System.out.println("Es fuerte: " + contrasena2.esFuerte());
        
        // se intenta cambiar el valor pero la contraseña es debil
        System.out.println(contrasena1.nuevoValor("1223"));
        
        // Ver que contraseña se genero si no se pasa nada por parametro
        System.out.println("Contrasena: " + contrasena3.getPassword());
        
        // Se intenta generar un valor y da NULL x no es mayor a 6
        System.out.println(contrasena2.generarAleatorio(5));
        
        // Se genera una nueva contraseña y se muestra
        System.out.println(contrasena2.generarAleatorio(10));
        System.out.println(contrasena2.getPassword());
    }

}