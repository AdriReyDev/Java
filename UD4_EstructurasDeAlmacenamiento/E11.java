package UD4_EstructurasDeAlmacenamiento;

/*2. Desarrollar el juego «la cámara secreta», que consiste en abrir una cámara
mediante su combinación secreta, que está formado por una combinación de dígitos
del uno al cinco. El jugador especificará cuál es la longitud de la combinación; a
mayor longitud, mayor será la dificultad del juego. La aplicación genera, de forma
aleatoria, una combinación secreta que el usuario tendrá que acertar. En cada intento
se muestra como pista, para cada dígito de la combinación introducido por el jugador,
si es mayor, menor o igual que el correspondiente en la combinación secreta. */

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class E11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cúantos numeros quieres que tenga la combinacion secreta? -> ");

        int longitud = sc.nextInt();
        int[] combinacionSecreta = new int[longitud];

        //Invoca a la funcion que rellena el array con los numeros random
        numRand(combinacionSecreta);

        // PARA PROBAR LA COMBINACION SECRETA

        /*for (int i : combinacionSecreta) {
            System.out.print(i + " ");
        }*/

//Declaramos y creamos el array de la combinacion del jugador
        int[] combinacionJugador = new int[longitud];

// Mientras los dos arrays no sean iguales se repite el bucle
        while (Arrays.equals(combinacionSecreta, combinacionJugador) == false ) {

            System.out.println("Introduce tu apuesta:");

            for (int i = 0; i < combinacionJugador.length; i++) {
                System.out.printf("numero %d: ", i + 1);
                int numb = sc.nextInt();
                combinacionJugador[i] = numb;
            }
            System.out.print("Tu apuesta es: ");
            for (int i : combinacionJugador) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.print("Tu resultado es :");
            String[] revision = aciertos(combinacionSecreta, combinacionJugador);
            for (String string : revision) {
                System.out.print(string + " ");
            }            
        }
    }
    
//Funcion que crea la combinacion secreta
    static void numRand(int[] combinacionSecreta) {

        Random rnd = new Random();

        for (int i = 0; i < combinacionSecreta.length; i++) {

            int rand = rnd.nextInt(5) + 1;
            combinacionSecreta[i] = rand;
        }
        
    }
//Funcion que hace un string para guiarte con los aciertos
    static String[] aciertos(int[] combinacionSecreta, int[] combinacionJugador) {

        String[] revision = new String[combinacionSecreta.length];

        for (int i = 0; i < combinacionJugador.length; i++) {
            if (combinacionSecreta[i] == combinacionJugador[i]) {
                revision[i] = "\u2713";
            } else if (combinacionSecreta[i] < combinacionJugador[i]) {
                revision[i] = "-";
            } else {
                revision[i] = "+";
            }
        }
        return revision;
    }
}
