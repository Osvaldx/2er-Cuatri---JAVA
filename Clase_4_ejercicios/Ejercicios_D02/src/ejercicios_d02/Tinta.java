/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_d02;

/**
 *
 * @author Nicolas
 */
public class Tinta {
    
    private Colores color;
    private Tipos tipo;
    
    public Tinta()
    {
        this.color = Colores.Verde;
        this.tipo = Tipos.China;
    }
    
    public Tinta(Colores color)
    {
        this.color = color;
    }
    
    public Tinta(Colores color, Tipos tipo)
    {
        this(color);
        this.tipo = tipo;
    }
    
    private String mostrar()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(this.color).append("\n");
        sb.append(this.tipo).append("\n");
        
        return sb.toString();
    }
    
    public static String mostrar(Tinta tinta)
    {  
        String retorno = "- Color: " + tinta.color + "\n- Tipo: " + tinta.tipo;
        return retorno;
    }
    
    public static boolean sonIguales(Tinta tinta_uno, Tinta tinta_dos)
    {
        boolean retorno = false;
        
        if(tinta_uno.color == tinta_dos.color)
        {
            retorno = true;
        }
        
        return retorno;
    }
    
    public static boolean sonDistintos(Tinta tinta_uno, Tinta tinta_dos)
    {
        return !sonIguales(tinta_uno,tinta_dos);
    }
    
    
}
