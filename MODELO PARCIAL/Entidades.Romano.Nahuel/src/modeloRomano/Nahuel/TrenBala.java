package modeloRomano.Nahuel;

import java.util.ArrayList;

public class TrenBala extends Tren {

    protected int cantidadElectroimanes;
    protected ArrayList<Pasajero> pasajeros;

    public TrenBala(int cantidadMaximaPasajeros, String destino, int cantidadElectroimanes) {
        super(cantidadMaximaPasajeros, destino);
        this.cantidadElectroimanes = cantidadElectroimanes;
        this.pasajeros = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("CANTIDAD ELECTROIMANES: ").append(this.cantidadElectroimanes).append("\n");
        for(Pasajero pasajero : this.getPasajeros()) {
            sb.append(pasajero.toString());
        }
        return sb.toString();
    }
    
    @Override
    public ArrayList<Pasajero> getPasajeros() {
        return this.pasajeros;
    }
    
    @Override
    public String getDestino() {
        StringBuilder sb = new StringBuilder();
        sb.append("El tren bala tiene destino: ").append(super.getDestino());
        return sb.toString();
    }

}