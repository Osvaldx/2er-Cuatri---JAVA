package ejerciciof06;

public class Jugador {

    private int dni;
    private String nombre;
    private int partidosJugados;
    private float promedioGoles;
    private int totalGoles;

    private Jugador() {
        this.dni = 0;
        this.nombre = "SIN NOMBRE";
        this.partidosJugados = 0;
        this.promedioGoles = 0;
        this.totalGoles = 0;
    }

    public Jugador(int dni, String nombre) {
        this();
        this.dni = dni;
        this.nombre = nombre;
    }

    public Jugador(int dni, String nombre, int partidosJugados, float promedioGoles) {
        this(dni, nombre);
        this.partidosJugados = partidosJugados;
        this.promedioGoles = promedioGoles;
    }

    public float getPromedioGoles() {
        return this.promedioGoles;
    }

    public String mostrarDatos() {
        StringBuilder sb = new StringBuilder();
        sb.append("############").append("\nDATOS DE JUGADOR: ").append(this.nombre).append("\n############\n");
        sb.append("- DNI: ").append(this.dni).append("\n");
        sb.append("- NOMBRE: ").append(this.nombre).append("\n");
        sb.append("- PARTIDOS JUGADOS: ").append(this.partidosJugados).append("\n");
        sb.append("- PROMEDIO DE GOLES: ").append(this.getPromedioGoles()).append("\n");
        sb.append("- TOTAL DE GOLES: ").append(this.totalGoles).append("\n############");
        return sb.toString();
    }

    public static boolean soniguales(Jugador jugador1, Jugador jugador2) {
        return (jugador1.dni == jugador2.dni);
    }

    public static boolean sonDistintos(Jugador jugador1, Jugador jugador2) {
        return Jugador.soniguales(jugador1, jugador2);
    }

}