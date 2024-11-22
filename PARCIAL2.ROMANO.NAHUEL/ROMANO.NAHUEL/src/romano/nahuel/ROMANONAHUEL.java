package romano.nahuel;

import java.io.IOException;

public class ROMANONAHUEL {

    public static void main(String[] args) {
        Estante estante = new Estante();
        
        try {
            // Crear los productos
            Producto producto1 = new Producto("Labial", "17472", Categoria.BELLEZA, 12000.0);
            Producto producto2 = new Producto("Microondas", "55128", Categoria.ELECTRONICA, 20000.0);
            Producto producto3 = new Producto("Remera", "32173", Categoria.MODA, 15200.0);
            Producto producto4 = new Producto("Pava", "94124", Categoria.HOGAR, 35100.0);
            Producto producto5 = new Producto("Pollera", "23153", Categoria.MODA, 10500.0);

            // Agregar los productos al estante
            estante.agregar(producto1);
            estante.agregar(producto2);
            estante.agregar(producto3);
            estante.agregar(producto4);
            estante.agregar(producto5);
            
            // Intentando agregar un producto nulo
            try {
                estante.agregar(null);
            }
            catch (ProductoNuloException e) {
                System.out.println("[!] ERROR: " + e.getMessage());
            }
            
            // Recorrer y mostrar el estante con sus productos, tal cuales fueron ingresado
            for(Producto producto : estante) {
                System.out.println(producto);
            }
            
            // Mostrar el estante ordenado de forma natural
            System.out.println("-------[ORDENADO DE FORMA NATURAL]-------");
            estante.ordenarPorNombre();
            for(Producto producto : estante) {
                System.out.println(producto);
            }
            System.out.println("-----------------------------------------");
            
            // Mostrar el estante ordenado por: CodigoBarra
            System.out.println("-------[ORDENADO POR CODIGO DE BARRA]-------");
            estante.ordenarPor(new ComparadorCodigoBarraProducto());
            for(Producto producto : estante) {
                System.out.println(producto);
            }
            System.out.println("-----------------------------------------");
            
            // Mostrar el estante ordenado por: Precio
            System.out.println("-------[ORDENADO DE PRECIO]-------");
            estante.ordenarPor(new ComparadorPrecioProducto());
            for(Producto producto : estante) {
                System.out.println(producto);
            }
            System.out.println("-----------------------------------------");
            
            // Mostrar el estante ordenado por: Categoria
            System.out.println("-------[ORDENADO DE CATEGORIA]-------");
            estante.ordenarPor(new ComparadorCategoriaProducto());
            for(Producto producto : estante) {
                System.out.println(producto);
            }
            System.out.println("-----------------------------------------");
            
            // Intentar eliminar un producto no existente del estante
            Producto productoNoLista = new Producto("Telefono", "51111", Categoria.ELECTRONICA, 54200);
            try {
                estante.eliminar(productoNoLista);
            }
            catch(ProductoNoEncontradoException e) {
                System.out.println("[!] ERROR: " + e.getMessage());
            }
            
            // Intentar recorrer un estante nulo.
            Estante estantevacio = new Estante();
            try {
                estantevacio.obtenerTodos();
            }
            catch(EstanteVacioException e) {
                System.out.println("[!] ERROR: " + e.getMessage());
            }
            
            // Eliminar un producto existente.
            estante.eliminar(producto1);
            
            // Mostrar el estante completo.
            System.out.println("-------[MOSTRAR EL ESTANTE COMPLETO]-------");
            for(Producto producto : estante.obtenerTodos()) {
                System.out.println(producto);
            }
            System.out.println("-----------------------------------------");
            
            // Serializar la colección de productos y guardarla en el archivo (productos.dat).
            try {
                estante.serializarBinario(estante.obtenerTodos(), "productos.dat");
            }
            catch(IOException | EstanteVacioException e) {
                System.out.println("[!] ERROR: " + e.getMessage());
            }
            
            // Deserializar desde el archivo (productos.dat) en una variable. Mostrar su contenido.
            
            try {
                System.out.println("-------[MOSTRAR LA LISTA DESEREALIZADO]-------");
                for(Object producto : estante.deserializarBinario("productos.dat")) {
                    System.out.println(producto);
                }
                System.out.println("-----------------------------------------");
            }
            catch(IOException e) {
                System.out.println("[!] ERROR: " + e.getMessage());
            }
            
        }
        catch (Exception e) {
            System.out.println("[!] ERROR: " + e.getMessage());
        }
    }
    
}
