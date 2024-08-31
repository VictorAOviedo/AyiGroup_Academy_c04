package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*5) Leer una cadena de caracteres desde las clases BufferedReader e InputStreamReader
y luego mostrar dicha cadena hasta la mitad.
*/
public class Ejercicio5 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce una linea de texto:");

        String entrada = br.readLine();
        System.out.println("Has escrito: " + entrada);

        int mitadDeEntrada = entrada.length() / 2;
        String mitad = entrada.substring(0,mitadDeEntrada);
        System.out.println("La primera mitad de la entrada es: " + mitad);



    }
}
