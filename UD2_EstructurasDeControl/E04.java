/*1. Diseñar un programa que muestre, para cada número entero introducido por 
teclado, si es par, si es positivo y su cuadrado. El proceso se repetirá hasta que el 
número introducido se 0*/

package UD2_EstructurasDeControl;

import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // iniciar scanner

        System.out.println("Introduce un numero entero: "); // peticion al usuario

        int num = sc.nextInt(); // declarar variable num por usuario

        //comienzo de bucle bajo condicion "El numero introducido es distinto de 0"
        while (num != 0) {

            //primer condicional dentro del bucle (numero es par y mayor que cero)
            if (((num % 2) != 0) && (num > 0)) {

                System.out.println("El numero es impar");

                System.out.println("El numero es mayor que cero");

                System.out.println(("El cuadrado del numero introducido es " + Math.pow(num, 2)));
            } //segundo condicional dentro del bucle (numero es impar y mayor que cero)
            else if (((num % 2) == 0) && num > 0) {

                System.out.println("El numero es impar");

                System.out.println("El numero es mayor que cero");

                System.out.println("El cuadrado del numero introducido es " + Math.pow(num, 2));

                // Fin de condicionales (Si el numero es menor que cero)
            } else {

                System.out.println("El numero es negativo.");
            }

            // Nueva peticion al usuario
            System.out.println("Introduce un numero entero: ");

            num = sc.nextInt();
        }

        sc.close();
    }
    
}
