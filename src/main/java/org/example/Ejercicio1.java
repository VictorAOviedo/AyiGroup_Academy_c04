package org.example;

import java.util.Scanner;

//1)Dado un número, descubrir si es par o impar.
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Introduce un numero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("El numero " + numero + " es par.");
        } else {
            System.out.println("El numero " + numero + " es impar.");
        }

        scanner.close();
    }
}