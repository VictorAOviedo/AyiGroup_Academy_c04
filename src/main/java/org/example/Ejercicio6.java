package org.example;

import java.io.Console;

/*6) Leer una cadena de caracteres utilizando la clase Console, convertir toda la cadena a
mayúscula e imprimir la misma.
*/
public class Ejercicio6 {
    public static void main(String[] args) {
        // Obtener el objeto Console
        Console consola = System.console();

        // Verificar si Console no es nulo
        if (consola == null) {
            System.out.println("No se puede obtener un objeto Console. Ejecuta el programa en una terminal.");
            return;
        }

        // Leer la cadena de caracteres
        System.out.println("Introduce una cadena de caracteres:");
        String cadena = consola.readLine();

        // Convertir la cadena a mayúsculas
        String cadenaMayusculas = cadena.toUpperCase();

        // Imprimir la cadena en mayúsculas
        System.out.println("La cadena en mayúsculas es:");
        System.out.println(cadenaMayusculas);
    }
}
