package ejerciciosg07;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Lavadero {

    private ArrayList<Vehiculo> vehiculos;
    private float precioAuto;
    private float precioCamion;
    private float precioMoto;

    public Lavadero(float precioAuto, float precioCamion, float precioMoto) {
        this.vehiculos = new ArrayList<>();
        this.precioAuto = precioAuto;
        this.precioCamion = precioCamion;
        this.precioMoto = precioMoto;
    }

    public String getDetalle() {
        StringBuilder sb = new StringBuilder();
        
        for(Vehiculo vehiculo : this.getVehiculos()) {
            if(vehiculo instanceof Auto) {
                sb.append("---------------------------" + "\n");
                sb.append(((Auto) vehiculo).mostrarAuto());
                sb.append("\n" + "---------------------------");
            }
            else if(vehiculo instanceof Moto) {
                sb.append("---------------------------" + "\n");
                sb.append(((Moto) vehiculo).mostrarMoto());
                sb.append("\n" + "---------------------------");
            }
            else if(vehiculo instanceof Camion) {
                sb.append("---------------------------" + "\n");
                sb.append(((Camion) vehiculo).mostrarCamion());
                sb.append("\n" + "---------------------------");
            }
            else {
                sb.append(vehiculo.mostrar());
            }
        }
        
        sb.append("##################################" + "\n");
        sb.append("- Precio Auto: " + this.precioAuto + "\n");
        sb.append("- Precio Camion: " + this.precioCamion + "\n");
        sb.append("- Precio Moto: " + this.precioMoto + "\n");
        sb.append("\n" + "##################################");
        
        return sb.toString();
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return this.vehiculos;
    }

    public Double MostrarTotalFacturado() {
        int contadorAuto = 0;
        int contadorMoto = 0;
        int contadorCamion = 0;
        
        for(Vehiculo vehiculo : this.getVehiculos()) {
            if(vehiculo instanceof Moto) {
                contadorMoto++;
            }
            else if(vehiculo instanceof Auto) {
                contadorAuto++;
            }
            else if(vehiculo instanceof Camion) {
                contadorCamion++;
            }
        }
        
        double gananciasTotal = ((contadorMoto * this.precioMoto) + (contadorAuto * this.precioAuto) + (contadorCamion * this.precioCamion));
        
        return gananciasTotal;
    }

    public Double MostrarTotalFacturado(TiposVehiculo vehiculotipo) {
        int contadorAuto = 0;
        int contadorMoto = 0;
        int contadorCamion = 0;
        
        if(vehiculotipo.equals(TiposVehiculo.MOTO)) {
            for(Vehiculo vehiculo : this.getVehiculos()) {
                if(vehiculo instanceof Moto) {
                    contadorMoto++;
                }
            }
        }
        else if(vehiculotipo.equals(TiposVehiculo.CAMION)) {
            for(Vehiculo vehiculo : this.getVehiculos()) {
                if(vehiculo instanceof Auto) {
                    contadorAuto++;
                }
            }
        }
        else if(vehiculotipo.equals(TiposVehiculo.AUTO)) {
            for(Vehiculo vehiculo : this.getVehiculos()) {
                if(vehiculo instanceof Camion) {
                    contadorCamion++;
                }
            }
        }
        
        return 0d;
    }

    public Boolean sonIguales(Lavadero lavadero1, Vehiculo vehiculo2) {
        boolean retorno = false;
        
        for(Vehiculo vehiculo1 : lavadero1.getVehiculos()) {
            if(Vehiculo.sonIguales(vehiculo1, vehiculo2)) {
                retorno = true;
                break;
            }
        }
        
        return retorno;
    }

    public Boolean agregar(Vehiculo vehiculo1) {
        boolean retorno = this.sonIguales(this, vehiculo1);
        
        if(!retorno) {
            this.getVehiculos().add(vehiculo1);
        }
        
        return retorno;
    }

    public Boolean remover(Vehiculo vehiculo1) {
        boolean retorno = this.sonIguales(this, vehiculo1);
        
        if(retorno) {
            this.getVehiculos().remove(vehiculo1);
        }
        
        return retorno;
    }

}