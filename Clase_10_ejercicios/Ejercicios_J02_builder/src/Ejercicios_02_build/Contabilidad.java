package Ejercicios_02_build;

import java.util.ArrayList;

public class Contabilidad<T extends Documento,U extends Documento> {
    private ArrayList<T> egresos;
    private ArrayList<U> ingresos;
    
    public Contabilidad() {
        this.egresos = new ArrayList<>();
        this.ingresos = new ArrayList<>();
    }
    
    public static <T> void agregarEgreso(Contabilidad c1,T t1) {
        c1.egresos.add(t1);
    }
    
    public static <U> void agregarIngreso(Contabilidad c1,U u1) {
        c1.ingresos.add(u1);
    }
}
