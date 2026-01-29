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

        // Iniciamos en 0 los Arrays a completar

        int[] pares = new int[0];

        int[] impares = new int[0];

        Scanner sc = new Scanner(System.in);

        // El usuario introduce n

        System.out.println("Introduce n: ");

        int n = sc.nextInt();

        // Ahora Array numerosEnteros tiene longitud n.

        numerosEnteros = new int[n];

        // En el bucle se introducen los n valores para cada indice

        for (int i = 0; i < numerosEnteros.length; i++) {

            System.out.printf("Introduce el %d numero: ", (i + 1));

            numerosEnteros[i] = sc.nextInt();

            if (numerosEnteros[i] % 2 == 0 && numerosEnteros[i] != 0) {

                // Si el numero introducido es par y no es 0 Array pares crece en 1 indice.

                pares = Arrays.copyOf(pares, pares.length + 1);

                // Ahora guarda el valor en el ultimo indice de Array pares

                pares[pares.length - 1] = numerosEnteros[i];

            } else if (numerosEnteros[i] % 2 != 0 && numerosEnteros[i] != 0) {

                // Si el numero introducido es impar y no es 0 Array impares crece en 1 indice.

                impares = Arrays.copyOf(impares, impares.length + 1);

                // Ahora guarda el valor en el ultimo indice de Array impares

                impares[impares.length - 1] = numerosEnteros[i];

            } else {

                // Si el numero introducido es 0 se repite la operacion para introducir el valor
                // del indice.

                System.out.println("El numero introducido no es valido: ");

                System.out.printf("Introduce el %d numero: ", (i + 1));

                numerosEnteros[i] = sc.nextInt();
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
