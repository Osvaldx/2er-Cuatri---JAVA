package ejercicios_j01;

import ejercicios.j01.build.EquipoBasquet;
import ejercicios.j01.build.EquipoFutbol;
import ejercicios.j01.build.Torneo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicios_J01 {

    public static void main(String[] args) {
        // creamos los torneos de futbol y basquet
        Torneo torneoFutbol = new Torneo("MUNDIAL FUTBOL");
        Torneo torneoBasquet = new Torneo("MUNDIAL BASQUET");
        // creamos un formato para la fecha para dps pasarlo a localdatetime y siga un formato
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        // aca creamos las fechas de cada equipo de futbol
        LocalDateTime fechaBoca = LocalDateTime.parse("03/04/1905 00:00:00", formato);
        LocalDateTime fechaRiver = LocalDateTime.parse("25/05/1901 00:00:00", formato);
        LocalDateTime fechaIndependiente = LocalDateTime.parse("01/01/1905 00:00:00", formato);
        // aca cremaos a los equipos de futbol con sus respectivos parametros
        EquipoFutbol equipoF1 = new EquipoFutbol("Boca Juniors",fechaBoca);
        EquipoFutbol equipoF2 = new EquipoFutbol("River",fechaBoca);
        EquipoFutbol equipoF3 = new EquipoFutbol("Independiente",fechaBoca);
        // creamos las fechas de los equipos de basquet
        LocalDateTime fechaSanLorenzo = LocalDateTime.parse("01/04/1908 00:00:00",formato);
        LocalDateTime fechaInstituto = LocalDateTime.parse("08/08/1918 00:00:00",formato);
        LocalDateTime fechaPenarol = LocalDateTime.parse("07/11/1929 00:00:00",formato);
        // creamos los equipos de basquet
        EquipoBasquet equipoB1 = new EquipoBasquet("San Lorenzo",fechaSanLorenzo);
        EquipoBasquet equipoB2 = new EquipoBasquet("Instituto",fechaInstituto);
        EquipoBasquet equipoB3 = new EquipoBasquet("Penarol",fechaPenarol);
        // agregamos los equipos de futbol al torneo de futbol
        torneoFutbol.agregar(equipoF1);
        torneoFutbol.agregar(equipoF2);
        torneoFutbol.agregar(equipoF3);
        // probamos que ya este dentro
        torneoFutbol.agregar(equipoF1);
        torneoFutbol.agregar(equipoF1);
        
        // agregamos los equipos de basquet al torneo de futbol
        torneoBasquet.agregar(equipoB1);
        torneoBasquet.agregar(equipoB2);
        torneoBasquet.agregar(equipoB3);
        // probamos que ya este dentro
        torneoBasquet.agregar(equipoB1);
        torneoBasquet.agregar(equipoB1);
        
        System.out.println(torneoFutbol.mostrar());
        System.out.println(torneoBasquet.mostrar());
        
        System.out.println(torneoFutbol.jugarPartido());
        System.out.println(torneoFutbol.jugarPartido());
        System.out.println(torneoFutbol.jugarPartido());
        
        System.out.println(torneoBasquet.jugarPartido());
        System.out.println(torneoBasquet.jugarPartido());
        System.out.println(torneoBasquet.jugarPartido());
    }
    
}
