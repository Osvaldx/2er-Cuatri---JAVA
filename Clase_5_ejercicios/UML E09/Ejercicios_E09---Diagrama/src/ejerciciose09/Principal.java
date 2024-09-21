package ejerciciose09;

import java.time.LocalDate;
import java.time.Month;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        Impresora impresora = new Impresora();
        
        impresora.recargarBandeja(10);
        
        LocalDate fechaCreada = LocalDate.of(2004, 5, 12);
        Documento documento1 = new Documento("Poema", fechaCreada, "habia una vez un ave re voladoragggggggggsssssssssssggggggggggggggggggggggggggggggggggg");
        
        impresora.imprimir(documento1);
        
    }

}