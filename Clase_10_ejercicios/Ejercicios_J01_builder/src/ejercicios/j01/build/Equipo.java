package ejercicios.j01.build;

import java.time.LocalDateTime;

public abstract class Equipo {
    private String nombre;
    private LocalDateTime fechaCreacion;
    
    public Equipo(String nombre, LocalDateTime fechaCreacion) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }
    
    @Override
    public boolean equals(Object o) {
        boolean rta = false;
        
        if(o instanceof Equipo) {
            rta = this.nombre.equals(((Equipo) o).nombre) && this.fechaCreacion.equals(((Equipo) o).fechaCreacion);
        }
        return rta;
    }
    
    public String getFicha() {
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(this.nombre).append("]");
        sb.append(" fundado el ");
        sb.append("[").append(this.fechaCreacion.toString()).append("]");
        
        return sb.toString();
    }
    
    public String getNombreEquipo() {
        return this.nombre;
    }
}
