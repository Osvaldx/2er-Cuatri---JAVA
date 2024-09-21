/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_d02;

/**
 *
 * @author Nicolas
 */
public class Pluma {
    
    private String marca;
    private Tinta tinta;
    private int cantidad;
    
    public Pluma()
    {
        this.marca = "sin marca";
        this.tinta = null;
        this.cantidad = 1;
    }
    
    public Pluma(String marca)
    {
        this.marca = marca;
    }
    
    public Pluma(String marca, Tinta tinta)
    {
        this(marca);
        this.tinta = tinta;
    }
    
    public Pluma(String marca, Tinta tinta, int cantidad)
    {
        this(marca,tinta);
        this.cantidad = cantidad;
    }
    
    public String mostrar()
    {
        StringBuilder sb = new StringBuilder();
        String mostrarTinta = "null";
        
        if(this.tinta != null)
        {
            mostrarTinta = Tinta.mostrar(this.tinta);
        }
        
        sb.append("- Cantidad: " + this.cantidad);
        sb.append("\n- Marca: " + this.marca);
        sb.append("\n- Tinta: " + mostrarTinta);
        
        return sb.toString();
    }
    
    public static boolean sonIguales(Pluma pluma, Tinta tinta)
    {
        boolean retorno = false;
        
        if(Tinta.sonIguales(pluma.tinta, tinta))
        {
            retorno = true;
        }
        
        return retorno;
    }
    
    public static boolean sonDistintos(Pluma pluma, Tinta tinta)
    {
        return !Pluma.sonIguales(pluma, tinta);
    }
    
    public static Pluma addPluma(Pluma pluma, Tinta tinta)
    {
        if(Pluma.sonIguales(pluma, tinta) == true)
        {
            pluma.cantidad += 1;
        }
        
        return pluma;
    }
    
    public static Pluma removePluma(Pluma pluma, Tinta tinta)
    {
        if(!Pluma.sonIguales(pluma, tinta))
        {
            if(pluma.cantidad > 0)
            {
                pluma.cantidad -= 1;
            }
            else
            {
                pluma.cantidad = 0;
            }
        }
        
        return pluma;
    }
}
