package romano.nahuel;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Novela extends Libro {

    private Genero genero;

    public Novela(String titulo, Float precio, Autor autor, Genero genero) {
        super(titulo, precio, autor);
        this.genero = genero;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("GENERO: ").append(this.genero);
        return sb.toString();
    }
    
    @Override
    public boolean equals(Object o) {
        boolean retorno = false;
        if(o instanceof Novela){
            if(Libro.sonIguales(((Novela) o), this) && this.genero.equals(((Novela) o).genero)){
                retorno = true;
            }
        }
        return retorno;
    }

}