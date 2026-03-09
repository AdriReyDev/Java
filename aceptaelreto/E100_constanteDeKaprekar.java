package aceptaelreto;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class E100_constanteDeKaprekar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numero = new int[4];

        System.out.print("Elige un número de 4 digitos que tenga al menos 2 diferentes");

        for (int i = 0; i < numero.length; i++) {
            System.out.printf("\nDigito %d: ", i + 1);
            numero[i] = sc.nextInt();
        }

        int ascendente = ascen(numero);
        int descendente = descen(numero);
        int kaprekar = descendente - ascendente;
        int iteraciones = 0;

        System.out.println(kaprekar);

        while (kaprekar != 6174) {
            numero = new int[4];
            for (int i = 3; i >= 0; i--) {
                numero[i] = kaprekar % 10;
                kaprekar /= 10;
                iteraciones++;
            }

            ascendente = ascen(numero);
            descendente = descen(numero);
            kaprekar = descendente - ascendente;

            System.out.println(kaprekar);
            System.out.printf("Número de iteraciones: %d%n", iteraciones);

        }
        sc.close();
    }

    static int ascen(int ascendente[]) {
        int ascen = 0;
        for (int i = 0; i < ascendente.length; i++) {
            ascen = ascen * 10 + ascendente[i];
        }

        return ascen;
    }

    static int descen(int descendente[]) {

        for (int i = 0; i < descendente.length / 2; i++) {
            int temp = descendente[i];
            descendente[i] = descendente[descendente.length - 1 - i];
            descendente[descendente.length - 1 - i] = temp;

            int descen = 0;

            for (int j : descendente) {

                descen = descen * 10 + j;

            }
            return descen;
        }

    }
}