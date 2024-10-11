package ejerciciosg01;

public enum Colores {

    ROJO("Rojo"),
    BLANCO("Blanco"),
    AZUL("Azul"),
    GRIS("Gris"),
    NEGRO("Negro");
    private String valor;

    private Colores(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return this.valor;
    }

}