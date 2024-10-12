package ejerciciof05;

import java.time.LocalDate;
import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Animal {

    private String tipoEspecie;
    private String nombre;
    private LocalDate fechaNacimiento;
    private ArrayList<String> HVacunas;

    public Animal(String tipoEspecie, String nombre, LocalDate fechaNacimiento) {
        this.tipoEspecie = tipoEspecie;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.HVacunas = new ArrayList<>();
    }

    public void addVacuna(String vacuna) {
        ArrayList<String> historialVacunas = this.HVacunas;
        if(!historialVacunas.contains(vacuna)) {
            historialVacunas.add(vacuna);
            System.out.println("[+] SE AGREGO LA VACUNA A LA LISTA");
        }
        else {
            System.out.println("[!] ESA VACUNA YA ESTA EN LA LISTA");
        }
    }

    public void removeVacuna(String vacuna) {
        ArrayList<String> historialVacunas = this.HVacunas;
        if(historialVacunas.contains(vacuna)) {
            historialVacunas.remove(vacuna);
            System.out.println("[-] SE ELIMINO LA VACUNA DE LA LISTA");
        }
        else {
            System.out.println("[!] ESA VACUNA NO ESTA EN LA LISTA");
        }
        
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public String mostrarInfoAnimal() {
        StringBuilder sb = new StringBuilder();
        sb.append("############################\n");
        sb.append("- TIPO ESPECIE: ").append(this.tipoEspecie).append("\n");
        sb.append("- NOMBRE: ").append(this.nombre).append("\n");
        sb.append("- FECHA NACIMIENTO: ").append(this.fechaNacimiento.toString()).append("\n");
        sb.append("-----------------------\n").append("LISTA VACUNAS: \n").append("-----------------------\n");
        for(String vacuna : this.HVacunas) {
            sb.append("- " + vacuna).append("\n");
        }
        
        return sb.toString();
    }

}