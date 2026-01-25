/*
 2. Crea una función que, mediante un booleano, indique si el carácter que se pasa
como parámetro de entrada corresponde con una vocal.
 */
package UD3_Funciones;

import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String newVocal;

        do {

            System.out.println("Introduce una letra para saber si es una vocal: ");

            newVocal = sc.next();

            if (vocal(newVocal)) {
                System.out.println("El parametro corresponde con una vocal.");
            } else {
                System.out.println("El parametro no corresponde con una vocal o has introducido mas de un caracter");
            }

        } while (!vocal(newVocal));

        sc.close();

    }

    static boolean vocal(String letraVocal) {
        if (letraVocal == null || letraVocal.length() != 1) {
            return false;
        }

        letraVocal = letraVocal.toLowerCase();

        String vocal = "aeiou";

        return vocal.contains(letraVocal);
    }
    
}
