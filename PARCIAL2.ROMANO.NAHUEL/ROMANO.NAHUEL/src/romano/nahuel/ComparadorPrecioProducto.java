package romano.nahuel;

import java.util.Comparator;

public class ComparadorPrecioProducto implements Comparator<Producto> {

    @Override
    public int compare(Producto o1, Producto o2) {
        return Double.compare(o1.getPrecio(), o2.getPrecio());
    }
    
}
