
/*7. Implementa la función: int[] suma(int t[], int numElementos), que crea y
devuelve un array con las sumas de los numElementos elementos consecutivos de t. Veamos
un ejemplo, sea t = [10, 1, 5, 8, 9, 2]. Si los elementos de t se agrupan de 3 en 3,
se harán las sumas:10 + 1 + 5 = 16
1 + 5 + 8 = 14
5 + 8 + 9 = 22
8 + 9 + 2 = 19 */
package EjerciciosFinalesArrays;

import java.util.Arrays;

public class E07 {

    static int[] suma(int t[], int numElementos) {

        // Copia para no modificar el array original
        int[] copyT = Arrays.copyOf(t, t.length);
        int[] sumasArray = new int[0];
        int i = 0;
        int suma;

        // Ventana deslizante: mientras queden suficientes elementos para formar un
        // grupo
        while (copyT.length >= numElementos) {
            int swap[] = Arrays.copyOfRange(copyT, 0, numElementos);
            suma = 0;
            for (int j = 0; j < swap.length; j++) {
                suma += swap[j];
            }

            // Expandimos sumasArray en 1 para guardar la nueva suma.
            sumasArray = Arrays.copyOf(sumasArray, sumasArray.length + 1);
            sumasArray[i] = suma;

            // Desplazamos la ventana 1 elementos a la izquierda
            copyT = Arrays.copyOfRange(copyT, 1, copyT.length);

            i++;

        }

        return sumasArray;

    }

    public static void main(String[] args) {

        int t[] = { 10, 1, 5, 8, 9, 2 };
        int numElementos = 3;

        System.out.println(Arrays.toString(suma(t, numElementos)));

    }

}
