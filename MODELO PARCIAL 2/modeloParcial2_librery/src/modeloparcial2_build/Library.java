package modeloparcial2_build;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Library implements Repository<Book>,Iterable<Book>,Serializer<Book> {
    
    private ArrayList<Book> books;
    
    public Library() {
        this.books = new ArrayList<>();
    }

    @Override
    public Iterator<Book> iterator() {
         return this.books.iterator();
    }
    
    public void sortBooks() {
        Collections.sort(this.books);
    }
    
    public void sortBooks(Comparator<Book> comparador) {
        Collections.sort(this.books, comparador);
    }

    @Override
    public void add(Book item) {
        this.books.add(item);
    }

    @Override
    public void remove(Book item) {
        this.books.remove(item);
    }

    @Override
    public ArrayList<Book> getAll() {
        return this.books;
    }

    @Override
    public boolean writeBinary(String ruta, ArrayList<Book> lista) {
        boolean rta = false;
        
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))) {
            oos.writeObject(lista);
            rta = true;
        }
        catch(Exception e) {
            System.out.println("[ERROR]: " + e.getMessage());
        }
        
        return rta;
    }

    @Override
    public boolean writeJSON(String ruta, ArrayList<Book> lista) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        boolean rta = false;
        
        try(FileWriter wr = new FileWriter(ruta)) {
            String json = gson.toJson(lista);
            wr.write(json);
            rta = true;
        }
        catch(Exception e) {
            System.out.println("[!] ERROR: " + e.getMessage());
        }
        
        return rta;
    }

    @Override
    public ArrayList<Book> readBinary(String ruta) {
        ArrayList<Book> lista = new ArrayList<>();
        
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))) {
            lista = (ArrayList<Book>) ois.readObject();
        }
        catch(Exception e) {
            System.out.println("[ERROR]: " + e.getMessage());
        }
        
        return lista;
    }

    @Override
    public ArrayList<Book> readJSON(String ruta) {
        Gson gson = new Gson();
        ArrayList<Book> lista = new ArrayList<>();
        
        try(FileReader re = new FileReader(ruta)) {
            Type type = new TypeToken<ArrayList<Book>>(){}.getType();
            lista = gson.fromJson(re, type);
        }
        catch(Exception e) {
            System.out.println("[!] ERROR: " + e.getMessage());
        }
        
        return lista;
        
    }
    
}
