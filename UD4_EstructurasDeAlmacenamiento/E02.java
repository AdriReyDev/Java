/*
 2. El programa debe pedir por teclado un número entero n, que indica cuántos
números se van a introducir. A continuación, el programa solicitará al usuario
que introduzca n números enteros, que se almacenarán en un array. Una vez
introducidos todos los números, el programa deberá:
 Calcular la media de los números positivos.
 Calcular la media de los números negativos.
 Contar cuántos ceros se han introducido.
Finalmente, se mostrarán por pantalla los resultados obtenidos.
 */
package UD4_EstructurasDeAlmacenamiento;

import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Indique el numero de digitos a introducir: ");

        int[] digitos = new int[sc.nextInt()];

        int sumaP = 0;
        int countP = 0;
        int sumaN = 0;
        int countN = 0;
        int countZ = 0;

        for (int i = 0; i < digitos.length; i++) {

            System.out.println("Introduce un digito: ");

            digitos[i] = sc.nextInt();

            if (digitos[i] > 0) {

                sumaP = sumaP + digitos[i];

                countP++;

            } else if (digitos[i] == 0) {

                countZ++;

            } else {

                sumaN = sumaN + digitos[i];

                countN++;

            }

        }

        sc.close();

        if (countP > 0) {

            System.out.printf("%nLa media de numeros positivos es: %.1f%n", (double) sumaP / countP);

        } else {

            System.out.println("No se introdujeron numeros positivos");
        }

        if (countN > 0) {

            System.out.printf("La media de numeros negativos es: %.1f%n", (double) sumaN / countN);

        } else {

            System.out.println("No se introdujeron numeros negativos");

        }

        System.out.println("El numero de ceros introducidos es: " + countZ);

    }
}
