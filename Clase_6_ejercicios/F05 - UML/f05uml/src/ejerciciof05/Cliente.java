package ejerciciof05;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Cliente {

    private String nombre;
    private String apellido;
    private int telefono;
    private String domicilio;
    private ArrayList<Animal> mascotas;

    public Cliente(String nombre, String apellido, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.domicilio = "No se ingreso ningun domicilio";
        this.mascotas = new ArrayList<>();
    }

    public Cliente(String nombre, String apellido, int telefono, String domicilio) {
        this(nombre, apellido, telefono);
        this.domicilio = domicilio;
    }

    private String getNombre() {
        return this.nombre;
    }

    private String getApellido() {
        return this.apellido;
    }

    private String getDomicilio() {
        return this.domicilio;
    }

    private ArrayList<Animal> getListaMascotas() {
        return this.mascotas;
    }

    public void addMascota(Animal animal1) {
        ArrayList<Animal> mascotas = this.getListaMascotas();
        if(!mascotas.contains(animal1)) {
            mascotas.add(animal1);
            System.out.println("[+] SE AGREGO A " + animal1.getNombre());
        }
        else {
            System.out.println("[!] LA MASCOTA " + animal1.getNombre() + " YA ESTA EN LA LISTA");
        }
    }

    public void removeMascota(Animal animal1) {
        ArrayList<Animal> mascotas = this.getListaMascotas();
        if(mascotas.contains(animal1)) {
            mascotas.remove(animal1);
            System.out.println("[-] SE ELIMINO A " + animal1.getNombre());
        }
        else {
            System.out.println("[!] " + animal1.getNombre() + " NO EXISTE");
        }
    }

    public String mostrarInfoCliente() {
        StringBuilder sb = new StringBuilder();
        sb.append("- NOMBRE: ").append(this.nombre).append("\n");
        sb.append("- APELLIDO: ").append(this.apellido).append("\n");
        sb.append("- TELEFONO: ").append(this.telefono).append("\n");
        sb.append("- DOMICILIO: ").append(this.domicilio).append("\n");
        sb.append("----------------------\n").append("LISTA MASCOTAS: \n").append("----------------------\n");
        ArrayList<Animal> mascotas = this.getListaMascotas();
        for(Animal mascota : mascotas) {
            sb.append(mascota.mostrarInfoAnimal());
        }
        
        return sb.toString();
    }

}