package ejercicios_g02;

import java.util.ArrayList;

public class Ejercicios_G02 {

    public static void main(String[] args) {
        ArrayList<Imprimible> listaImprimibles = new ArrayList<>();
        
        listaImprimibles.add(new Documento("Informacion de usuarios"));
        listaImprimibles.add(new Foto("Foto de vacaciones"));
        listaImprimibles.add(new Documento("Contrasenas de usuarios"));
        listaImprimibles.add(new Foto("Foto de paisajes"));
        
        for(Imprimible imprimir : listaImprimibles) {
            imprimir.imprimible();
        }
    }
    
}
