package org.example;


/*4) Data la siguiente cadena de caracteres: “La casa de la esquina es muy grande”
● Eliminar todos los espacios de dicha letra.
● Informar el tamaño de la cadena con espacios y sin espacios.
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        String cadena = "La casa de la esquina es muy grande";

        String eliminandoEspacios = cadena.replace(" ","");
        int conEspacios = cadena.length();
        int sinEspaios = eliminandoEspacios.length();

        System.out.println("El tamaño de la cadena con espacios es de: " + conEspacios);
        System.out.println("El tamaño de la cadena sin espacios es de: " + sinEspaios);

    }
}
