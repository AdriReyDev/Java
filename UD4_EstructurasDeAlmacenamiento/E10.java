/*1. Escribir la función int[] eliminarMayores(int t[], int mayor) que crea y
devuelve un copia del array t donde se han eliminado todos los elementos que son
mayores que valor.
*/

package UD4_EstructurasDeAlmacenamiento;

import java.util.Arrays;
import java.util.Scanner;

public class E10 {

    public static void main(String[] args) {

      /* Scanner sc = new Scanner(System.in);

        int[] t = new int[] { 10, 15, 20, 30, 45, 50, 55, 60, 65 };
        System.out.println("Introduce valor");
        int mayor = sc.nextInt();
        System.out.println(Arrays.toString(eliminarMayores(t, mayor)));

        sc.close();*/  
    }

    public static int[] eliminarMayores(int t[], int mayor) {

        int posOrigen = mayor;
        int[] eliminarMayores = Arrays.copyOf(t, t.length);
        
//El bucle empieza a recorrer el indice 0 hasta el indice de longitud eliminarMayores
        for (int i = 0; i < eliminarMayores.length; i++) {

// Si el valor del indice i es mayor a posOrigen entra en el if
            if (eliminarMayores[i] > posOrigen) {

                //el indice i de eliminarMayores pasa a tener el ultimo valor de eliminarMayores
                eliminarMayores[i] = eliminarMayores[eliminarMayores.length - 1];

                // eliminarMayores ahora es una copia de eliminarMayores con un indice menos
                eliminarMayores = Arrays.copyOf(eliminarMayores,eliminarMayores.length-1);

                // Acabamos de poner un valor nuevo en la posición 'i' (el que venía del final).
                // Como el bucle for va a hacer 'i++' al terminar esta vuelta, se saltaría revisar este nuevo valor.
                // Hacemos 'i--' para anular ese avance y obligar al bucle a revisar de nuevo la posición 'i'.
                
                i--;

            }

        }
        t = eliminarMayores;
        return t;
    }

}
