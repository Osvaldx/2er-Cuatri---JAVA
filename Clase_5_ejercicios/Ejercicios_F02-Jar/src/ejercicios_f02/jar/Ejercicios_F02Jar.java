package ejercicios_f02.jar;

import ejerciciosf02.Conductor;
import ejerciciosf02.Empresa;

public class Ejercicios_F02Jar {

    public static void main(String[] args) {
        int[] ListaKConductor1 = {200, 599, 899, 0, 256, 0, 400};
        Conductor conductor1 = new Conductor("Juan Pérez", ListaKConductor1);

        int[] ListaKConductor2 = {150, 300, 400, 500, 100, 100, 700};
        Conductor conductor2 = new Conductor("María López", ListaKConductor2);

        int[] ListaKConductor3 = {0, 0, 600, 400, 350, 700, 200};
        Conductor conductor3 = new Conductor("Carlos Gómez", ListaKConductor3);
        
        Conductor[] ListaConductores = {conductor1, conductor2, conductor3};
        
        Empresa empresa = new Empresa(ListaConductores);
        
        System.out.println("Kilometros Recorrido total Conductor1: " + empresa.getRecorridoTotalConductor(conductor1) + "\n" +
                           "Kilometros Recorrido total Conductor2: " + empresa.getRecorridoTotalConductor(conductor2) + "\n" + 
                           "Kilometros Recorrido total Conductor3: " + empresa.getRecorridoTotalConductor(conductor3) + "\n");
        
        Conductor conductorMaxK = empresa.getConductorMasKilometros();
        System.out.println("Conductor con mas kilometros semanales es: " + conductorMaxK.getNombre() + " con un total de " + empresa.getRecorridoTotalConductor(conductorMaxK) + " K");
        
        Conductor conductorMaxD3K = empresa.getConductorMasKilometros(3);
        System.out.println("Conductor con mas kilometros el dia 3 es: " + conductorMaxD3K.getNombre() + " con un total de " + empresa.getRecorridoDiaConductor(conductorMaxD3K, 3));
        
        Conductor conductorMaxD5K = empresa.getConductorMasKilometros(5);
        System.out.println("Conductor con mas kilometros el dia 5 es: " + conductorMaxD5K.getNombre() + " con un total de " + empresa.getRecorridoDiaConductor(conductorMaxD5K, 5));
    }
    
}
