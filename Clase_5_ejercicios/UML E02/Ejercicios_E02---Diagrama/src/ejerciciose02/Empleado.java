package ejerciciose02;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Empleado {

    private int DNI;
    private String nombre;
    private String apellido;
    private int salarioBase;
    private String estadoCivil;
    private int cantidadHijos;

    public Empleado(int DNI,String nombre, String apellido, int salarioBase, String estadoCivil, int cantidadHijos) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
        this.estadoCivil = estadoCivil;
        this.cantidadHijos = cantidadHijos;
    }

    public float obtenerSalarioFinal() {
        float salarioFinal = this.salarioBase;
        
        if(this.estadoCivil.equals("soltero")) {
            salarioFinal -= (this.salarioBase * 0.04);
        }
        
        if(this.cantidadHijos >= 1) {
            int contadorHijos = 1;
            float porcentaje = 0;
            for(int i = 1; i <= this.cantidadHijos && contadorHijos <= 3; i++) {
                porcentaje += 0.04;
                contadorHijos++;
            }
            
            salarioFinal += (this.salarioBase * porcentaje);
        }
        
        return salarioFinal;
    }
    
    public String mostrarInformacion() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("DNI: ").append(this.DNI);
        sb.append("\n");
        sb.append("Nombre: ").append(this.nombre);
        sb.append("\n");
        sb.append("Apellido: ").append(this.apellido);
        sb.append("\n");
        sb.append("Salario BASE: ").append(this.salarioBase);
        sb.append("\n");
        sb.append("Estado Civil: ").append(this.estadoCivil);
        sb.append("\n");
        sb.append("Cantidad hijos: ").append(this.cantidadHijos);
        sb.append("\n");
        sb.append("------------------------------------");
        sb.append("\n");
        sb.append("Salario FINAL: ").append(this.obtenerSalarioFinal());
        
        return sb.toString();
    }

}