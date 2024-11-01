package ejerciciof06;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        // Crear jugadores
        Jugador jugador1 = new Jugador(12345678, "Lionel Messi", 800, 0.8f);
        Jugador jugador2 = new Jugador(87654321, "Cristiano Ronaldo", 900, 0.7f);
        Jugador jugador3 = new Jugador(12345678, "Neymar Jr"); // Jugador con mismo DNI que jugador1

        // Mostrar datos de los jugadores
        System.out.println(jugador1.mostrarDatos());
        System.out.println();
        System.out.println(jugador2.mostrarDatos());
        System.out.println();
        System.out.println(jugador3.mostrarDatos());
        System.out.println();

        // Comparar jugadores
        System.out.println("Comparando jugadores:");
        System.out.println("¿Son iguales (jugador1 y jugador2)? " + Jugador.soniguales(jugador1, jugador2));
        System.out.println("¿Son distintos (jugador1 y jugador3)? " + Jugador.sonDistintos(jugador1, jugador3));
        System.out.println();
    }
}