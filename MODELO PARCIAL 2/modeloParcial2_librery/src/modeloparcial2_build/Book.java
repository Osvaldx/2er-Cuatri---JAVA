package modeloparcial2_build;

import java.io.Serializable;

public class Book implements Comparable<Book>,Serializable {
    
    private static final long serialVersionUID = 1L;
    private String title;
    private String author;
    private int year;
    
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", year=" + year + '}';
    }
    
    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.getTitle());
    }
    
}
