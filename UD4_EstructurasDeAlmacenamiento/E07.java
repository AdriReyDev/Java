/*2. Definir una función que tome como parámetros los dos arrays, el primero con los 6
números de una apuesta a la primitiva y el segundo (ordenado) con los 6 números de
la combinación ganadora. La función devolverá el número de aciertos. */
package UD4_EstructurasDeAlmacenamiento;

import java.util.Arrays;

public class E07 {

    public static void main(String[] args) {

        int[] arrApuesta = new int[] { 7, 4, 1, 5, 6, 10 };

        int[] arrWin = new int[] { 1, 2, 3, 4, 5, 6 };

        Arrays.sort(arrWin);

        System.out.println(aciertos(arrApuesta, arrWin));

    }

    static int aciertos(int[] arrApuesta, int[] arrWin) {

        int i = 0;
        int countBS = 0;
        int aciertos = 0;

        while (i < arrApuesta.length) {

            countBS = Arrays.binarySearch(arrWin, arrApuesta[i]);

            if (countBS >= 0) {

                aciertos++;
            }
            i++;
        }
        return aciertos;
    }

}
