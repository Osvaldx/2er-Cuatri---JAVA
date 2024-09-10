/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesBoligrafos;

/**
 *
 * @author Nicolas
 */
public class Boligrafo {
    
    private final short CANTIDAD_MAXIMA_TINTA = 100;
    private String color;
    private Short tinta;

    public Boligrafo(String color, Short tinta) {
        this.color = color;
        this.tinta = tinta;
    }
    
    public String getColor()
    {
        return this.pintarColor() + this.color + "\033[0m";
    }
    
    public Short getTinta()
    {
        return this.tinta;
    }

    private void setTinta(Short tinta)
    {
        short sumaTinta = (short) (this.tinta + tinta);
        
        if(sumaTinta >= 0 && sumaTinta <= 100)
        {
            this.tinta = sumaTinta;
        }
        else if(sumaTinta > 100)
        {
            this.tinta = 100;
        }
    }
    
    public void recargar()
    {
        this.setTinta(this.CANTIDAD_MAXIMA_TINTA);
    }
    
    private String pintarColor()
    {
        String opcionColor = this.color;
        String retornoColor = "";
        
        switch (opcionColor.toLowerCase())
        {
            case "rojo":
                retornoColor = "\033[31m";
                break;
            case "negro":
                retornoColor = "\033[30m";
                break;
            case "verde":
                retornoColor = "\033[32m";
                break;
            case "amarillo":
                retornoColor = "\033[33m";
                break;
            case "azul":
                retornoColor = "\033[34m";
                break;
            case "magenta":
                retornoColor = "\033[35m";
                break;
            case "cian":
                retornoColor = "\033[36m";
                break;
            case "blanco":
                retornoColor = "\033[37m";
                break;
                
        }
        
        return retornoColor;
    }
    
    public String pintar(Short gasto)
    {
        String retorno = "";
        String colorANSI = this.pintarColor();
        String resetColor = "\033[0m";
        
        Short auxiliar = this.tinta;
        Short gastoPositivo = (short) (gasto * -1);
        this.setTinta(gasto);
        
        if(gastoPositivo > auxiliar)
        {
            
            for(int i = 0; i < auxiliar; i++)
            {
                retorno += "*";
            }
        }
        else
        {
            for(int i = 0; i < gastoPositivo; i++)
            {
                retorno += "*";
            }
        }
        
        return colorANSI + retorno + resetColor;
    }
    
    
    
}
