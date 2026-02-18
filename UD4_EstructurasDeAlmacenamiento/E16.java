/*3. Realiza un programa que solicite al usuario dos caracteres por teclado y compruebe si el
primero es una letra y el segundo es un número, mostrando por pantalla un mensaje indicando si
la combinación introducida es correcta o incorrecta (“ Correcto”) utilizando el símbolo generado
mediante Unicode, utilizando los métodos de la clase Character. */
package UD4_EstructurasDeAlmacenamiento;

import java.util.Scanner;

public class E16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos carácteres");
        System.out.print("El primero tiene que ser una letra y el segundo un número: ");

        String str = sc.nextLine();

        if (Character.isLetter(str.charAt(0)) && Character.isDigit(str.charAt(1))) {
            System.out.println("Correcto \u2713");
        } else {
            System.out.println("Incorrecto \u2717");
        }
        sc.close();
    }

}
