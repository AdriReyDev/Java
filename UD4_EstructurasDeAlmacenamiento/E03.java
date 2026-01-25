/*
 3. Crear la función int máximo (int t[]), que devuelva el máximo valor
contenido en el array t.
 */
package UD4_EstructurasDeAlmacenamiento;

import java.util.Locale;

public class E03 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int min = 1;

        int max = 50;
        
        //Se declara la variable con la longitud que tendra el Array
        int longitud = (int) (Math.random() * (max - min + 1) + min);

        int[] t = new int[longitud];

        for (int i = 0; i < t.length; i++) {

            t[i] = (int) (Math.random() * (max - min + 1) + min);

        }
        
        /* -----Bloque de pruebas-------
        System.out.println(lenght);
        System.out.println(Arrays.toString(t));
        */
        System.out.println("El maximo valor de t[] es : " + maximo(t));

    }

    static int maximo(int t[]) {

        // para evitar errores se inicia mayor en el primer indice del array a recorrer
        
        int mayor = t[0];

        for (int i = 0; i < t.length; i++) {

            if (t[i] > mayor) {

                mayor = t[i];

            }

        }
        return mayor;
    }
    
}
