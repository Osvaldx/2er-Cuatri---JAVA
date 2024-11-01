package ejerempresalogistica;

import java.util.ArrayList;

public class EmpresaDeLogistica {
    ArrayList<TransportadorDePaquete> listaTransportadores;
    
    public EmpresaDeLogistica() {
        this.listaTransportadores = new ArrayList<>();
    }
    
    public void iniciarEntrega() {
        for(TransportadorDePaquete trasportador : this.listaTransportadores) {
            trasportador.transportarPaquete("Centro de la ciudad");
        }
    }
    
    public void agregarTransportador(TransportadorDePaquete t) {
        this.listaTransportadores.add(t);
    }
}
