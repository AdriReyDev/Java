package EjerciciosFinalesArrays;

/*1. Realiza la función: int[] buscarTodos(int t[], int clave), que crea y devuelve 
un array con todos los índices de los elementos donde se encuentra la clave de búsqueda. En 
el caso de que clave no se encuentre en el array t, la función devolverá un array vacío (longitud 
0). 
 */

import java.util.Arrays;

public class E01 {

    public static void main(String[] args) {

       /* 
        // ESCENARIO 1: El número se repite varias veces
        int[] notas = { 5, 9, 5, 10, 5, 7 };
        System.out.println("--- Test 1: Buscar el 5 ---");
        System.out.println("Esperado: [0, 2, 4]");
        System.out.println("Obtenido: " + Arrays.toString(buscarTodos(notas, 5)));
        
        // ESCENARIO 2: El número NO existe
        System.out.println("\n--- Test 2: Buscar el 99 (no existe) ---");
        System.out.println("Esperado: []");
        System.out.println("Obtenido: " + Arrays.toString(buscarTodos(notas, 99)));

        // ESCENARIO 3: Array vacío
        int[] vacio = {};
        System.out.println("\n--- Test 3: Array vacío ---");
        System.out.println("Esperado: []");
        System.out.println("Obtenido: " + Arrays.toString(buscarTodos(vacio, 5)));*/ 
    }

    

    static int[] buscarTodos(int t[], int clave) {

        int[] copy = new int[0];
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                copy = Arrays.copyOf(copy, copy.length + 1);
                copy[copy.length - 1] = i;
            }
        }
        return copy;
    }
}
