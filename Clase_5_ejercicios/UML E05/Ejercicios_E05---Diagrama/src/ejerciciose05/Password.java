package ejerciciose05;

import java.util.Random;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Password {

    private String valorContra;

    public Password(String valorContra) {
        this.valorContra = valorContra;
    }

    public Password() {
        Random random = new Random();
        String contrasena = generarAleatorio(15);
        
        this.valorContra = contrasena;
    }
    
    public String getPassword() {
        return this.valorContra;
    }

    public boolean esFuerte() {
        boolean retorno = false;
        
        if(this.valorContra.length() >= 8) {
            retorno = true;
        }
        
        return retorno;
    }

    public String nuevoValor(String nuevaContra) {
        String retorno = "No se pudo cambiar el valor";
        
        if(nuevaContra.length() >= 6) {
            this.valorContra = nuevaContra;
            retorno = "Se cambio el valor de la contra!";
        }
        
        return retorno;
    }

    public String generarAleatorio(int int1) {
        if(int1 < 6) {
            return null;
        }
        
        Random random = new Random();
        String retorno = "";
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        
        for(int i = 0; i < int1; i++) {
            int index = random.nextInt(0, caracteres.length());
            retorno += caracteres.charAt(index);
        }
        
        return retorno;
    }

}