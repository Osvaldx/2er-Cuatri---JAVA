package ejerciciof05;

import java.time.LocalDate;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        
        // Crear animales
        Animal perro = new Animal("Perro", "Rex", LocalDate.of(2018, 3, 21));
        Animal gato = new Animal("Gato", "Michi", LocalDate.of(2019, 6, 15));
        Animal loro = new Animal("Loro", "Pepe", LocalDate.of(2020, 1, 30));
        Animal conejo = new Animal("Conejo", "Bunny", LocalDate.of(2021, 11, 5));
        Animal iguana = new Animal("Iguana", "Spike", LocalDate.of(2022, 8, 12));

        // Agregar vacunas a los animales
        perro.addVacuna("Rabia");
        perro.addVacuna("Parvovirus");

        gato.addVacuna("Leucemia Felina");

        loro.addVacuna("Psitacosis");

        // Crear clientes
        Cliente cliente1 = new Cliente("Juan", "Perez", 123456789);
        Cliente cliente2 = new Cliente("Ana", "García", 987654321, "Calle Falsa 123");
        Cliente cliente3 = new Cliente("Carlos", "Lopez", 555123456, "Avenida Siempre Viva 742");

        // Agregar mascotas a los clientes
        cliente1.addMascota(perro);
        cliente1.addMascota(gato);

        cliente2.addMascota(loro);
        cliente2.addMascota(iguana);

        cliente3.addMascota(conejo);

        // Mostrar información de los clientes
        System.out.println("=== INFORMACION DE CLIENTE ===");
        System.out.println(cliente1.mostrarInfoCliente());
        System.out.println("=== INFORMACION DE CLIENTE ===");
        System.out.println(cliente2.mostrarInfoCliente());
        System.out.println("=== INFORMACION DE CLIENTE ===");
        System.out.println(cliente3.mostrarInfoCliente());

        // Eliminar una mascota de un cliente
        cliente1.removeMascota(gato);

        // Mostrar la información de nuevo después de eliminar una mascota
        System.out.println("=== INFORMACION DE CLIENTES (POST ELIMINACION) ===");
        System.out.println(cliente1.mostrarInfoCliente());

        // Eliminar una vacuna
        loro.removeVacuna("Psitacosis");

        // Mostrar la información del loro después de eliminar una vacuna
        System.out.println("=== INFORMACION DEL LORO (POST ELIMINACION VACUNA) ===");
        loro.mostrarInfoAnimal();
    }
}