package org.example;

import java.util.Scanner;

/*8) Realizar un programa que lea por teclado una cadena de caracteres, mostrar todas las
palabras por separado de dicha cadena (No incluir espacios)
 */
public class Ejercicio8v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese una cadena:");
        String entrada = sc.nextLine();

        //Reemplazo espacio por salto de linea
        String espacio = entrada.replace(" ", "\n|\r");
        System.out.println(espacio.trim());

    }
}
