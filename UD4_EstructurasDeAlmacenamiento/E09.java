/*3. Diseñar una aplicación para gestionar un campeonato de programación, donde se
introduce la puntuación (enteros) obtenidos por 5 programadores, conforme van
terminando su prueba. La aplicación debe mostrar las puntuaciones ordenadas de los
5 participantes. En ocasiones, cuando finalizan los 5 participantes anteriores, se
suman al campeonato programadores de exhibición, cuyos puntos se incluyen con el
resto. La forma de especificar que no intervienen más programadores de exhibición es
introducir como puntuación un –1. La aplicación debe mostrar, finalmente, los puntos
ordenados de todos los participantes.*/

package UD4_EstructurasDeAlmacenamiento;

import java.util.Arrays;
import java.util.Scanner;

public class E09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] puntuaciones = new int[5];
        for (int i = 0; i < puntuaciones.length; i++) {
            System.out.printf("Introduce los puntos del jugador %d: ", i + 1);
            int puntos = sc.nextInt();
            puntuaciones[i] = puntos;
        }

        //Ordena Array puntuaciones
        Arrays.sort(puntuaciones);
        System.out.println(
                "------La puntuacion de los programadores principales es:" + Arrays.toString(puntuaciones) + "------");
        System.out.println(
                "------Introduce los puntos de los programadores de exhibición (introduce -1 para terminar)-----");

         //Crea una llave que condiciona a while e inicia un contador programadores exhibicion      
        boolean key = false;
        int count = 0;

        //El bucle se repite mientras key=false
        while (key == false) { //darle vuelta a las cosas que se pueden sacar
            System.out.printf("Introduce los puntos del jugador %d: ", count + 1);
            int puntos = sc.nextInt();

        // Si puntos == -1 se para el bucle, break impide que se indexe el valor -1 introducido
            if (puntos == -1) {
                key = true;
                break;
            }

            int pos = Arrays.binarySearch(puntuaciones, puntos);
            int puntoInserccion = pos;

         //Si el resultado es negativo no encuentra el numero y devuelve la posicion(ej (-3) la posicion es -2)
         //Excepcion creada por si pos existe y Binary Search devuelve valor positivo

            if (pos < 0) puntoInserccion = -(pos) - 1;
         //Crea una copia de Array puntuaciones y agrega +1 indice             
            int[] puntuacionesCopy = Arrays.copyOf(puntuaciones, puntuaciones.length + 1);

         //Copia de puntuaciones desde indice cero hacia  puntuacionesCopy   los valores hasta puntoInsercion -1
            System.arraycopy(puntuaciones, 0, puntuacionesCopy, 0, puntoInserccion);
            
         //Copia puntuaciones desde punto de inserccion hacia    
            System.arraycopy(puntuaciones, puntoInserccion, puntuacionesCopy, puntoInserccion + 1,puntuaciones.length - puntoInserccion);
            puntuacionesCopy[puntoInserccion] = puntos;
            puntuaciones = puntuacionesCopy;
            count++;
        }
        System.out.println(
                "------La puntuación final de todos los participantes es: " + Arrays.toString(puntuaciones) + "------");
        sc.close();
    }
}
