package romano.nahuel;

import java.util.Comparator;

public class ComparadorCodigoBarraProducto implements Comparator<Producto> {

    @Override
    public int compare(Producto o1, Producto o2) {
        return o1.getCodigoBarra().compareTo(o2.getCodigoBarra());
    }
    
}
