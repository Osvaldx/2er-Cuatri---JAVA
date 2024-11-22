/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
1. Excepciones Verificadas (Checked Exceptions)
Estas son excepciones que el compilador obliga a manejar (mediante un bloque try-catch o 
con la declaración throws en el método). Son excepciones que generalmente ocurren por 
razones externas al programa, como problemas de entrada/salida, errores de red, etc.

IOException: Se produce cuando hay un error de entrada/salida, como la lectura de un archivo.

SQLException: Error en operaciones relacionadas con bases de datos.

ClassNotFoundException: Ocurre cuando se intenta cargar una clase que no existe.

FileNotFoundException: Es una subclase de IOException, se lanza cuando se intenta abrir un archivo que no existe.

ParseException: Se lanza cuando ocurre un error al analizar datos, como un número o fecha en un formato incorrecto.

InterruptedException: Ocurre cuando un hilo está esperando, durmiendo o realizando una operación de espera y es interrumpido.

2. Excepciones No Verificadas (Unchecked Exceptions)
Son excepciones que no necesitan ser obligatoriamente manejadas. 
Se derivan de la clase RuntimeException. Generalmente indican errores 
lógicos o problemas internos en la programación.


NullPointerException: Ocurre cuando se intenta acceder a un objeto que no ha sido inicializado (es decir, es null).

ArrayIndexOutOfBoundsException: Se produce cuando se intenta acceder a un índice fuera de los límites de un arreglo.

ArithmeticException: Ocurre cuando se realiza una operación aritmética ilegal, como dividir por cero.

ClassCastException: Se lanza cuando se intenta hacer un "casting" (conversión de tipo) a una clase incompatible.

NumberFormatException: Se lanza cuando se intenta convertir un String a un número, pero el formato no es válido.

IllegalArgumentException: Se lanza cuando un argumento pasado a un método es inapropiado o fuera de rango.

IllegalStateException: Se lanza cuando el estado de un objeto no es apropiado para la operación solicitada.


3. Excepciones de Error (Errors)
Estas son situaciones graves que generalmente no pueden ser manejadas por el programa y 
normalmente no se deben capturar. Son de la clase Error o sus subclases.

OutOfMemoryError: Se lanza cuando el programa agota la memoria disponible.

StackOverflowError: Ocurre cuando se produce una llamada recursiva excesiva que llena el stack de ejecución.

VirtualMachineError: Se lanza cuando la máquina virtual de Java encuentra un error interno grave.
 */


//Excepciones Personalizadas

// Excepción verificada
class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}

// Excepción no verificada
class EdadInvalidaRuntimeException extends RuntimeException {
    public EdadInvalidaRuntimeException(String mensaje) {
        super(mensaje);
    }
}
