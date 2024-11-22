package romano.nahuel;

import java.io.IOException;
import java.util.ArrayList;

public interface Serializadora<T> {
    
    boolean serializarBinario(ArrayList<T> lista, String archivo) throws IOException;
    ArrayList<T> deserializarBinario(String archivo) throws IOException, ClassNotFoundException;
}
