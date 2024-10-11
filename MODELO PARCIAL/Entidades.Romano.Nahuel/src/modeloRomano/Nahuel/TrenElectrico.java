package modeloRomano.Nahuel;

import java.util.ArrayList;

public class TrenElectrico extends Tren {

    protected ArrayList<Pasajero> pasajeros;

    public TrenElectrico(int cantidadMaximaPasajeros, String destino) {
        super(cantidadMaximaPasajeros,destino);
        this.pasajeros = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
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
        sb.append("El tren electrico tiene destino: ").append(super.getDestino());
        return sb.toString();
    }

}