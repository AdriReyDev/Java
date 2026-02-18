/*2.Crea una matriz 4x4 y rellénala de la siguiente forma:
▪ Si la fila y la columna son iguales (i == j), guarda un 1.
▪ En el resto de posiciones, guarda un 0.
Después, muestra la matriz por pantalla. */

package UD4_EstructurasDeAlmacenamiento;
import java.util.Arrays;
public class E12 {

    public static void main(String[] args) {
        int [][] matriz = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) { matriz [i][j] = 1;
                    
                } else {
                    matriz [i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(matriz));
    } 
}
