/*2. Definir una función que tome como parámetros los dos arrays, el primero con los 6
números de una apuesta a la primitiva y el segundo (ordenado) con los 6 números de
la combinación ganadora. La función devolverá el número de aciertos. */
package UD4_EstructurasDeAlmacenamiento;

public class E06 {

    public static void main(String[] args) {

    }

    static int aciertos(int arrApuesta[], int arrWin[]) {

        int count = 0;

        for (int i = 0; i < arrWin.length; i++) {

            for (int j = 0; j < arrApuesta.length; j++) {

                if (arrWin[i] == arrApuesta[j]) {

                    count++;

                    break;

                }

            }

        }

        return count;
    }
}
