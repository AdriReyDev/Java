
/*
 1. Escribir la función int[] rellenaPares(int longitud, int fin), que crea y
devuelve un array ordenado de la longitud especificada, que se encuentra relleno con
números pares aleatorios comprendidos en el rango desde 2 hasta fin(inclusive).
 */

package UD4_EstructurasDeAlmacenamiento;

import java.util.Arrays;
import java.util.Scanner;

public class E04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la longitud");

        int longitud = sc.nextInt();

        System.out.println("Introduce fin de rango de pares: ");

        int fin = sc.nextInt();

        System.out.println(Arrays.toString(rellenaPares(longitud, fin)));

        sc.close();

        // hacerlo con un for each

    }

    static int[] rellenaPares(int longitud, int fin) {

        int[] pares = new int[longitud];

        int min = 2;
        int max = fin;
        int i = 0;
        int rellenaIndice = (int) (Math.random() * (max - min + 1)) + min;

        while (i < pares.length) {

            if (rellenaIndice % 2 == 0) {

                pares[i] = rellenaIndice;

                i++;

            }

            rellenaIndice = (int) (Math.random() * (max - min + 1)) + min;

        }

        Arrays.sort(pares);

        return pares;

    }

}
