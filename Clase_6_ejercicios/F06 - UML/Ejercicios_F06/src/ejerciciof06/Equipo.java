package ejerciciof06;

import java.util.ArrayList;

public class Equipo {

    private int cantidadDeJugadores;
    private String nombre;
    private ArrayList<Jugador> jugadores;

    private Equipo() {
        this.cantidadDeJugadores = 0;
        this.nombre = "SIN NOMBRE";
        this.jugadores = new ArrayList<>();
    }

    public Equipo(int cantidadDeJugadores, String nombre) {
        this();
        this.cantidadDeJugadores = cantidadDeJugadores;
        this.nombre = nombre;
    }

    public Equipo add(Equipo equipo1, Jugador jugador2) {
        int longitudLista = equipo1.jugadores.size();
        if(longitudLista < equipo1.cantidadDeJugadores) {
            equipo1.jugadores.add(jugador2);
        }
        return equipo1;
    }

}