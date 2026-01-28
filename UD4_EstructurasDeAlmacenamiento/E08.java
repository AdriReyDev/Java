/*Leer y almacenar n números enteros en un array, a partir del que se construirán
otros dos arrays con los elementos con valores pares e impares del primero,
respectivamente. Los arrays pares e impares deben mantener el orden de entrada de
los datos.*/
package UD4_EstructurasDeAlmacenamiento;

import java.util.Scanner;
import java.util.Arrays;

public class E08 {

    public static void main(String[] args) {

        int[] numerosEnteros;

        int[] pares = new int[0];

        int[] impares = new int[0];

        int par = 0;
        int imp = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce n: ");

        int n = sc.nextInt();

        numerosEnteros = new int[n];

        for (int i = 0; i < numerosEnteros.length; i++) {

            System.out.printf("Introduce el %d numero: ", (i + 1));

            numerosEnteros[i] = sc.nextInt();

            if (numerosEnteros[i] % 2 == 0) {

                pares = Arrays.copyOf(pares, pares.length + 1);

                pares[par] = numerosEnteros[i];

                par++;

            } else {

                impares = Arrays.copyOf(impares, impares.length + 1);

                impares[imp] = numerosEnteros[i];

                imp++;

            }

        }

        System.out.println("----Array Original----");

        for (int i : numerosEnteros) {

            System.out.println(i);

        }

        System.out.println("----Impares----");

        for (int i : impares) {

            System.out.println(i);
        }

        System.out.println("----Pares----");

        for (int i : pares) {

            System.out.println(i);

        }

        sc.close();

    }

}
