package UD4_EstructurasDeAlmacenamiento;

import java.util.Arrays;
import java.util.Scanner;

public class E09V2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] puntuaciones = new int[5];
        int puntos = 0;
        for (int i = 0; i < puntuaciones.length; i++) {
            System.out.printf("Introduce los puntos del jugador %d: ", i + 1);
            puntos = sc.nextInt();
            puntuaciones[i] = puntos;
        }

        // Ordena Array puntuaciones
        Arrays.sort(puntuaciones);
        System.out.println(
                "------La puntuacion de los programadores principales es:" + Arrays.toString(puntuaciones) + "------");
        System.out.println(
                "------Introduce los puntos de los programadores de exhibición (introduce -1 para terminar)-----");

        int pos = 0;
        int puntoInserccion = pos;
        if (pos < 0)
            puntoInserccion = -(pos) - 1;

        int[] puntuacionesCopy = Arrays.copyOf(puntuaciones, puntuaciones.length + 1);
        int count = 0;

        System.out.printf("Introduce los puntos del jugador %d: ", count + 1);
        puntos = sc.nextInt();
        count++;

        while (puntos != -1) {

            pos = Arrays.binarySearch(puntuaciones, puntos);
            puntuacionesCopy = Arrays.copyOf(puntuaciones, puntuaciones.length + 1);
            System.arraycopy(puntuaciones, 0, puntuacionesCopy, 0, puntoInserccion);

            // Copia puntuaciones desde punto de inserccion hacia
            System.arraycopy(puntuaciones, puntoInserccion, puntuacionesCopy, puntoInserccion + 1,
                    puntuaciones.length - puntoInserccion);
            puntuacionesCopy[puntoInserccion] = puntos;
            puntuaciones = puntuacionesCopy;

            System.out.printf("Introduce los puntos del jugador Exhibicion %d: ", count + 1);
            puntos = sc.nextInt();

            count++;

        }

        // Copia de puntuaciones desde indice cero hacia puntuacionesCopy los valores
        // hasta puntoInsercion -1

        System.out.println(
                "------La puntuación final de todos los participantes es: " + Arrays.toString(puntuaciones) + "------");
        sc.close();
    }
}
