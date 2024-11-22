package modeloparcial2_build;

import java.util.ArrayList;

public interface Serializer<T> {
    
    boolean writeBinary(String ruta, ArrayList<T> lista);
    boolean writeJSON(String ruta, ArrayList<T> lista);
    ArrayList<T> readBinary(String ruta);
    ArrayList<T> readJSON(String ruta);
    
}
