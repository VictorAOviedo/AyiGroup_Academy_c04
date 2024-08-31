package org.example;

import java.util.Scanner;

//2)Dado dos números enteros aleatorios, descubrir el mayor número.

public class Ejercicio2 {
    public static void main(String [] args){

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduce numero 1:");
        int numero1 = scanner1.nextInt();


        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Introduce numero 2:");
        int numero2 = scanner2.nextInt();


        if (numero1 > numero2){
            System.out.println("El numero mayor es: " + numero1);
        }else {
            System.out.println("El numero mayor es: " + numero2);
        }

        scanner1.close();
        scanner2.close();
    }
}
