package ejerciciose02;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public enum EstadoCivil {

    SOLTERO("soltero"),
    CASADO("casado"),
    DIVORCIADO("divorciado"),
    VIUDO("viudo");
    private String valor;

    EstadoCivil(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return this.valor;
    }

}