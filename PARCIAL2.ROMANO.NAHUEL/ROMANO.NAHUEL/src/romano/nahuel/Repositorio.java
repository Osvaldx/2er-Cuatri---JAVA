package romano.nahuel;

import java.util.ArrayList;

public interface Repositorio<T> {
    
    boolean agregar(T item) throws ProductoNuloException;
    boolean eliminar(T item) throws ProductoNoEncontradoException;
    ArrayList<T> obtenerTodos() throws EstanteVacioException;
    
}
