/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_c02;

import java.util.Random;

/**
 *
 * @author Nicolas
 */
public class Adivinadora {
    
    private int numeroSecreto;
    private int intentos;

    public Adivinadora()
    {
        Random random = new Random();
        
        this.numeroSecreto = random.nextInt(100) +1;
        this.intentos = 0;
    }
    
    public String Adivinar(int numeroIngresado, int maxIntentos)
    {
        String mensaje = "Igual";
        if(this.intentos < maxIntentos || maxIntentos == 0)
        {
            this.intentos += 1;

            if(numeroIngresado > this.numeroSecreto)
            {
                mensaje = "Mayor";
            }
            else if(numeroIngresado < this.numeroSecreto)
            {
                mensaje = "Menor";
            }

        }
        else
        {
            mensaje = "NO QUEDAN INTENTOS";
        }
        
        return mensaje;
        
    }

    public int GetIntentos()
    {
        return intentos;
    }

    public int getNumeroSecreto() {
        return numeroSecreto;
    }
    
    
}
