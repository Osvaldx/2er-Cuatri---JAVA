package modeloRomano.Nahuel;

import java.util.ArrayList;

public abstract class Tren {

    protected int cantidadMaximaPasajeros;
    protected String destino;
    protected Boolean motorEncendido;

    public Tren(int cantidadMaximaPasajeros, String destino) {
        this.cantidadMaximaPasajeros = cantidadMaximaPasajeros;
        this.destino = destino;
        this.motorEncendido = false;
    }

    public int getCantidadMaximaPasajeros() {
        return this.cantidadMaximaPasajeros;
    }

    public Boolean getMotorEncendido() {
        return this.motorEncendido;
    }

    public void setMotorEncendido(boolean estadoMotor) {
        this.motorEncendido = estadoMotor;
    }

    public String getDestino() {
        return this.destino.toUpperCase();
    }

    public abstract ArrayList<Pasajero> getPasajeros();

    public static Boolean sonIguales(Pasajero pasajero1, Tren tren2) {
        boolean retorno = false;
        
        for(Pasajero pasajero : tren2.getPasajeros()) {
            if(Pasajero.sonIguales(pasajero1, pasajero)) {
                retorno = true;
            }
        }
        
        return retorno;
    }

    public void agregar(Pasajero pasajero1) {
        if(!Tren.sonIguales(pasajero1, this)) {
            if(this.getPasajeros().size() < cantidadMaximaPasajeros) {
                this.getPasajeros().add(pasajero1);
            }
            else {
                System.out.println("[!] SE SUPERO LA CANTIDAD MAXIMA DE PASAJEROS!");
                
            }
        }
        else {
            System.out.println("[!] ESTE PASAJERO YA EXISTE!");
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CANTIDAD MAXIMA DE PASAJEROS: ").append(this.getCantidadMaximaPasajeros()).append("\n");
        sb.append("DESTINO: ").append(this.getDestino()).append("\n");
        sb.append("MOTOR ENCENDIDO: ").append(this.getMotorEncendido()).append("\n");
        return sb.toString();
    }

}