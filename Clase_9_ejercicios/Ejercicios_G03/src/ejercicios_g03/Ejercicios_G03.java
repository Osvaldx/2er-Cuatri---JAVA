package ejercicios_g03;

import java.util.ArrayList;

public class Ejercicios_G03 {

    public static void main(String[] args) {
        ArrayList<Pagable> pagable = new ArrayList<>();
        
        pagable.add(new Empleado("Ivo", 320));
        pagable.add(new Freelancer("Keru", 500, 4));
        pagable.add(new Empleado("Lucas", 200));
        
        for(Pagable pagables : pagable) {
            pagables.pagar(200);
        }
    }
    
}
