package org.example;

import java.util.Arrays;
import java.util.Scanner;

/*8) Realizar un programa que lea por teclado una cadena de caracteres, mostrar todas las
palabras por separado de dicha cadena (No incluir espacios)
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una cadena de caracteres:");
        String entrada = sc.nextLine();

        /*Se utiliza split(" ") para dividir la cadena en un arreglo de palabras,
         basándose en un solo espacio como delimitador.*/
        String palabras = Arrays.toString(entrada.split(" "));

        System.out.println(palabras);

        sc.close();
    }
}
