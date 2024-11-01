package ejerempresalogistica;

public class PersonaMensajera implements TransportadorDePaquete {
    
    public PersonaMensajera() {
        // constructor vacio
    }
    
    public void EntregaAPie() {
        System.out.println("[!] Se esta entregando el paquete a pie.");
    }

    @Override
    public void transportarPaquete(String destino) {
        System.out.println("[!] La persona entregara el paquete a: " + destino);
    }
}
