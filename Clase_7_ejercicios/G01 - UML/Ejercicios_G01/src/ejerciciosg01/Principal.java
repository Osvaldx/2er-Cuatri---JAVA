package ejerciciosg01;

public class Principal {

    public static void main(String[] args) {
        Moto moto200 = new Moto((short) 2,(short) 0,Colores.ROJO,(short) 200);
        Camion camion1 = new Camion((short) 8,(short) 4,Colores.GRIS,(short) 6,(short) 2000);
        Automovil auto1 = new Automovil((short) 4,(short) 4,Colores.NEGRO,(short) 5,(short) 4);
        
        moto200.mostrar();
        camion1.mostrar();
        auto1.mostrar();
    }

}