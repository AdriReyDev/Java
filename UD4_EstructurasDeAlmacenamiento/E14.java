package UD4_EstructurasDeAlmacenamiento;
/*1. Realiza un programa que pida al usuario un único carácter por teclado y muestre por pantalla si
ese carácter es un dígito, si es una letra, si es letra o dígito, si es mayúscula, si es minúscula, si es
un espacio (‘ ‘) y si es cualquier carácter en blanco, mostrando el resultado de cada comprobación
mediante valores booleanos */

import java.util.Scanner;

public class E14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("introduce un Caracter: ");

        // Se necesita poner charAt(0) para que solo pase el primer valor de la cadena
        char c = sc.nextLine().charAt(0);
        System.out.println("Es digito: " + Character.isDigit(c));
        System.out.println("Es letra: " + Character.isLetter(c));
        System.out.println("Es letra o digito: " + Character.isLetterOrDigit(c));
        System.out.println("Es mayúscula: " + Character.isUpperCase(c));
        System.out.println("Es minúscula:" + Character.isLowerCase(c));
        System.out.println("Es un espacio:  " + Character.isSpaceChar(c));
        System.out.println("Es cualquier caracter en blanco: " + Character.isWhitespace(c));

        sc.close();
    }
}
