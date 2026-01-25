/* 
Codificar el juego “el número secreto”, que consiste en acertar un número entre 1 
y 100 (generado aleatoriamente). Para ello se introduce por teclado una serie de 
números, para los que se indica: “mayor” o “menor”, según sea mayor o menos 
con respecto al número secreto. El proceso termina cuando el usuario acierta o 
cuando se rinde (introduciendo un -1). Nota: para generar un entero aleatorio 
dentro de este rango utiliza: int aleatorio = (int) (Math.random() * 100) + 1;
 */
package UD2_EstructurasDeControl;

import java.util.Scanner;

public class E09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // iniciar scanner

        int aleatorio = (int) (Math.random() * 100) + 1; // creacion variable nunmero aleatorio

        // System.out.println(aleatorio); // comprobacion numero aleatorio
        System.out.println("Introduce el numero. ¿Acertaras? "); // Pregunta al usuario

        int num = sc.nextInt(); // variable numero intorducido por el usuario

        // comienza el bucle ( mientras que aleatorio sea diferente de numero y el
        // numero sea diferente de -1)
        while ((aleatorio != num) && (num != -1)) {

            // condicional si el numero es mayor que aleatorio le dira al usuario que el
            // numero secreto es menor
            if (num > aleatorio) {

                System.out.println("El numero secreto es menor que el que has metido");
            } // condicional si el numero es menor que aleatorio le dira al usuario que el
              // numero secreto es mayor
            else if (num < aleatorio) {

                System.out.println("El numero secreto es mayor que el que has metido");
            }

            // Vuelve a preguntar al usuario
            System.out.println("Introduce otra vez el numero. ¿Acertaras? ");

            num = sc.nextInt();
        }
        sc.close();
    }
}