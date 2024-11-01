package ejercicios_g01;

import java.util.ArrayList;

public class Ejercicios_G01 {

    public static void main(String[] args) {
        ArrayList<Volador> voladores = new ArrayList<>();
        
        Avion avion = new Avion();
        Helicoptero helicoptero = new Helicoptero();
        
        avion.despegar();
        avion.aterrizar();
        
        helicoptero.despegar();
        helicoptero.aterrizar();
        
        voladores.add(avion);
        voladores.add(helicoptero);
        voladores.add(new Mosquito());
        
        for(Volador v : voladores) {
            v.aterrizar();
            v.despegar();
            
            if(v instanceof Mosquito) {
                ((Mosquito) v).picar();
            }
        }   
        
        
    }
    
}
