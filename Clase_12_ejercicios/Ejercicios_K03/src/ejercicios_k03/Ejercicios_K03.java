package ejercicios_k03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicios_K03 {

    public static void main(String[] args) {
        
        String fechahoy = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmssSSS"));
        
        try {
            Producto producto1 = new Producto("Shampoo", 20, 5);
            
            producto1.setCantidad(-2);
        }
        catch(Exception e) {
            ArchivoTexto.guardar(fechahoy + ".txt", e.getMessage());
        }
        
        try {
            Producto producto2 = new Producto("Dentrifico", 5, 2);
            
            producto2.setPrecio(-10);
        }
        catch(Exception e) {
            ArchivoTexto.guardar(fechahoy + ".txt", e.getMessage());
        }
        
        try {
            Producto producto3 = new Producto("Jabon", 10, 8);
            
            producto3.reabastecer(-20);
        }
        catch(Exception e) {
            ArchivoTexto.guardar(fechahoy + ".txt", e.getMessage());
        }
    }
    
}
