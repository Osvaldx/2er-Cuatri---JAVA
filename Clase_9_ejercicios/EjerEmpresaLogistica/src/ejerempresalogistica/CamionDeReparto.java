package ejerempresalogistica;

public class CamionDeReparto extends Vehiculo implements TransportadorDePaquete {
    
    public CamionDeReparto() {
        // constructor vacio
    }
    
    public void conducirRapido() {
        System.out.println("[>>] Se esta entregando el paquete a gran velocidad.");
    }

    @Override
    public void transportarPaquete(String destino) {
        System.out.println("[!] El camion entregara el paquete a: " + destino);
    }
}
