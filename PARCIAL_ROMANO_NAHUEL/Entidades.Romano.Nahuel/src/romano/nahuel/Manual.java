package romano.nahuel;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Manual extends Libro {

    private Tipo tipo;

    public Manual(String titulo, Float precio, String nombre, String apellido, Tipo tipo) {
        super(titulo, precio, nombre, apellido);
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("TIPO: ").append(this.tipo);
        return sb.toString();
    }
    
    @Override
    public boolean equals(Object o) {
        boolean retorno = false;
        if(o instanceof Manual){
            if(Libro.sonIguales(((Manual) o), this) && this.tipo.equals(((Manual) o).tipo)){
                retorno = true;
            }
        }
        return retorno;
    }

}