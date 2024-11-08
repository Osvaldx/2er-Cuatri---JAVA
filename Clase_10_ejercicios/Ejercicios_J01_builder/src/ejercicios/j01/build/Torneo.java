package ejercicios.j01.build;

import java.util.ArrayList;
import java.util.Random;

public class Torneo<T extends Equipo>{
    private ArrayList<T> equipos;
    private String nombre;
    
    public Torneo(String nombre) {
        this.equipos = new ArrayList<>();
        this.nombre = nombre;
    }
    
    @Override
    public boolean equals(Object o) {
        boolean rta = false;
        
        if(o instanceof Equipo) {
            rta = this.equipos.contains(o);
        }
        return rta;
    }
    
    public void agregar(T t1) {
        if(!Torneo.this.equals(t1)) {
            this.equipos.add(t1);
            System.out.println("[+] Se agrego el equipo");
        }
        else {
            System.out.println("[!] Ya se encuentra en el Torneo");
        }
    }
    
    public String mostrar() {
        StringBuilder sb = new StringBuilder();
        sb.append("Torneo: ").append(this.nombre).append("\n");
        sb.append("-------------------").append("\n");
        sb.append("Participantes:").append("\n-------------------\n");
        for(T equipo : this.equipos) {
            sb.append(equipo.getFicha()).append("\n");
        }
        sb.append("-------------------");
        
        return sb.toString();
    }
    
    private String calcularPartido(T t1, T t2) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        
        int resultado1 = random.nextInt(0,7);
        int resultado2 = random.nextInt(0,7);
        
        sb.append("[").append(t1.getNombreEquipo()).append("]: ").append(resultado1);
        sb.append(" - ");
        sb.append(resultado2).append(" :[").append(t2.getNombreEquipo()).append("]");
        
        return sb.toString();
    }
    
    public String jugarPartido() {
        Random random = new Random();
        int indice1 = random.nextInt(0,this.equipos.size());
        int indice2 = random.nextInt(0,this.equipos.size());
        
        while(true) {
            if(indice1 == indice2) {
                indice2 = random.nextInt(0,this.equipos.size());
            }
            else {
                break;
            }
        }
        
        return this.calcularPartido(this.equipos.get(indice1), this.equipos.get(indice2));
    }
}
