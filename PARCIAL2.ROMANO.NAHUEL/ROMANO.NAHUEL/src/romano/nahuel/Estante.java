package romano.nahuel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Estante implements Iterable<Producto>,Serializadora, Repositorio<Producto> {
    
    private ArrayList<Producto> productos;

    public Estante() {
        this.productos = new ArrayList<>();
    }

    @Override
    public Iterator<Producto> iterator() {
        return this.productos.iterator();
    }
    
    public void ordenarPorNombre() {
        Collections.sort(this.productos);
    }
    
    public void ordenarPor(Comparator<Producto> comparador) {
        Collections.sort(this.productos,comparador);
    }
    
    @Override
    public boolean agregar(Producto producto) throws ProductoNuloException {
        boolean rta = true;
        
        if(producto == null) {
            rta = false;
            throw new ProductoNuloException("El producto no puede ser nulo");
        }
        
        this.productos.add(producto);
        
        return rta;
    }

    @Override
    public boolean eliminar(Producto producto) throws ProductoNoEncontradoException {
        boolean rta = true;
        
        if (!productos.contains(producto)) {
            rta = false;
            throw new ProductoNoEncontradoException("El producto no esta en el estante");
        }
        
        this.productos.remove(producto);
        
        return rta;
    }

    @Override
    public ArrayList<Producto> obtenerTodos() throws EstanteVacioException {
        if(this.productos.isEmpty()) {
            throw new EstanteVacioException("El estante esta vacio");
        }
        
        return this.productos;
    }

    @Override
    public boolean serializarBinario(ArrayList lista, String archivo) throws IOException {
        boolean rta = false;
        
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(lista);
            rta = true;
        }
        catch(IOException e) {
            System.out.println("[!] ERROR: " + e.getMessage());
        }
        
        return rta;
    }

    @Override
    public ArrayList deserializarBinario(String archivo) throws IOException {
        ArrayList<Producto> lista = new ArrayList<>();
        
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            lista = (ArrayList<Producto>) ois.readObject();
        }
        catch(IOException e) {
            System.out.println("[!] ERROR: " + e.getMessage());
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(Estante.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;
    }
    
}
