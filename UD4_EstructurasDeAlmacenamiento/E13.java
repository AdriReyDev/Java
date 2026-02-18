/*3. Crea una matriz de 5×5 y rellénala de la siguiente forma:
▪ En cada posición [i][j] se debe guardar el valor i + j
▪ Después, muestra la matriz por pantalla
Finalmente, muestra la suma de todos los valores de la matriz. */
package UD4_EstructurasDeAlmacenamiento;

import java.util.Arrays;
public class E13 {

    public static void main(String[] args) {
        
        int[][] matriz = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = i + j;               
            }           
        }
        System.out.println(Arrays.deepToString(matriz));
    }
}
