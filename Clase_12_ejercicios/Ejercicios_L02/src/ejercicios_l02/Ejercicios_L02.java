package ejercicios_l02;

import ejercicios_l02_build.Alumno;
import ejercicios_l02_build.comandosArchivo;

public class Ejercicios_L02 {

    public static void main(String[] args) {
        Alumno alumno1 = new Alumno(12345, "Romano", "Nahuel");
        Alumno alumno2 = new Alumno(54321, "Saja", "Ivo");
        Alumno alumno3 = new Alumno(55332, "Bianchi", "Stefania");
        
        String rutaArchivo = "./alumnos.txt";
        
        comandosArchivo.guardar(alumno1, rutaArchivo, false);
        comandosArchivo.guardar(alumno2, rutaArchivo, true);
        comandosArchivo.guardar(alumno3, rutaArchivo, true);
        
        System.out.println(comandosArchivo.leer(rutaArchivo));
        
        System.out.println(comandosArchivo.buscarAlumno(12345, rutaArchivo));
        
        System.out.println(comandosArchivo.modificarAlumno(alumno2, rutaArchivo));
        
//        System.out.println(comandosArchivo.eliminarAlumno(alumno2, rutaArchivo));
    }
    
}
