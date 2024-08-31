package org.example;

import java.util.Scanner;

/*7) Crear un programa que solicite el ingreso de un número, se deberá multiplicar dicho
número por la constante PI, luego informar el resultado.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero:");

        double entrada = sc.nextInt();
        System.out.println("Usted ingreso: " + entrada);

        double resultado = entrada * Math.PI;
        System.out.println("El resultado de multiplicar " + entrada + " por PI es: " + resultado);

        sc.close();
    }

}
