/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometria;

/**
 *
 * @author Nicolas
 */
public class Rectangulo {
    
    private float area;
    private float perimetro;
    private Punto vertice1;
    private Punto vertice2;
    private Punto vertice3;
    private Punto vertice4;
    private boolean banderaArea = false;
    private boolean banderaPerimetro = false;
    
    public Rectangulo(Punto vertice1, Punto vertice3)
    {
        int x_1 = vertice1.getX();
        int y_1 = vertice1.getY();
        
        int x_3 = vertice3.getX();
        int y_3 = vertice3.getY();
        
        Punto vertice2 = new Punto(x_3,y_1);
        
        Punto vertice4 = new Punto(x_1,y_3);
        
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
        this.vertice4 = vertice4;
    }
    
    public float area()
    {
        if(this.banderaArea == false)
        {
            int base = Math.abs(this.vertice3.getX() - this.vertice1.getX());
            int altura = Math.abs(this.vertice3.getY() - this.vertice1.getY());
            
            this.area = (base * altura);
            this.banderaArea = true;
        }
        
        return this.area;
        
    }
    
    public float perimetro()
    {
        if(this.banderaPerimetro == false)
        {
            int base = Math.abs(this.vertice3.getX() - this.vertice1.getX());
            int altura = Math.abs(this.vertice3.getY() - this.vertice1.getY());
            
            this.perimetro = (2 * (base + altura));
            this.banderaPerimetro = true;
        }
        
        return this.perimetro;
    }

    public Punto getVertice1() {
        return vertice1;
    }

    public Punto getVertice2() {
        return vertice2;
    }

    public Punto getVertice3() {
        return vertice3;
    }

    public Punto getVertice4() {
        return vertice4;
    }
    
    
}
