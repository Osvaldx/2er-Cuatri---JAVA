package ejerempresalogistica;

public class DronDeEntrega extends DispositivoElectronico implements TransportadorDePaquete {
    
    public DronDeEntrega() {
        // constructor vacio
    }
    
    @Override
    public void encender() {
        System.out.println("[*] El Dron se ha encendido.");
    }

    @Override
    public void transportarPaquete(String destino) {
        System.out.println("[!] El Dron entregara el paquete a: " + destino);
    }
}
