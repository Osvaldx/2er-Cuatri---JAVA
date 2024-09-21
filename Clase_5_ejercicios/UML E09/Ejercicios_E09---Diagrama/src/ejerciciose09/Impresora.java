package ejerciciose09;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Impresora {

    private boolean estado;
    private int cantidadHojas;
    private int nivelTinta;

    public Impresora() {
        this.estado = false;
        this.cantidadHojas = 0;
        this.nivelTinta = 100;
    }

    public double nivelSegunCantCaracteres(int cantCaracteres) {
        return (double) cantCaracteres / 50;
    }

    public void recargarBandeja(int cantHojas) {
        if(cantHojas > 0) {
            int sumaHojas = this.cantidadHojas + cantHojas;
            if(sumaHojas > 35) {
                this.cantidadHojas = 35;
            }
            else {
                this.cantidadHojas += sumaHojas;
            }
        }
    }

    public void imprimir(Documento documento) {
        StringBuilder sb = new StringBuilder();
        
        int hojasNecesarias = (int) (documento.getCuerpo().length() / 20);
        
        if(documento.getCuerpo().length() <= this.nivelTinta && this.cantidadHojas >= hojasNecesarias) {
            sb.append("-----------------------------\n");
            sb.append("Fecha: ").append(documento.getFecha()).append("         ").append(documento.getTitulo()).append("\n");
            sb.append(documento.getCuerpo());
            sb.append("\n-----------------------------");

            this.nivelTinta -= nivelSegunCantCaracteres(documento.getCuerpo().length());
            this.cantidadHojas -= hojasNecesarias;
            
            System.out.println(sb.toString());
            
            System.out.println("Se imprimio y se gasto de hojas: " + hojasNecesarias + " y de tinta: " + nivelSegunCantCaracteres(documento.getCuerpo().length()));
        }
        else {
            System.out.println("No hay suficiente tinta o papel para imprimir!");
        }
        
    }

}