package ejerempresalogistica;

public class EjerEmpresaLogistica {

    public static void main(String[] args) {
        EmpresaDeLogistica empresaLogistica = new EmpresaDeLogistica();
        
        CamionDeReparto camionDeReparto = new CamionDeReparto();
        DronDeEntrega dronDeEntrega = new DronDeEntrega();
        PersonaMensajera personaMensajera = new PersonaMensajera();
        
        // Se agregan transportadores a la lista de la empresa
        empresaLogistica.agregarTransportador(camionDeReparto);
        empresaLogistica.agregarTransportador(dronDeEntrega);
        empresaLogistica.agregarTransportador(personaMensajera);
        
        // Probamos los metodos unicos de cada clase
        System.out.println("CAMION:");
        camionDeReparto.conducirRapido();
        System.out.println(" ");
        System.out.println("DRON:");
        dronDeEntrega.encender();
        System.out.println(" ");
        System.out.println("PERSONA:");
        personaMensajera.EntregaAPie();
        System.out.println(" ");
        
        // Iniciamos la entrega
        System.out.println("ENTREGANDO: ");
        empresaLogistica.iniciarEntrega();
    }
    
}
