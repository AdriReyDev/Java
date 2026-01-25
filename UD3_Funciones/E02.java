/*
Escribir una función a la que se le pasen dos enteros y muestre todos los números
comprendidos entre ellos.
 */
package UD3_Funciones;

import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");

        int n1 = sc.nextInt();

        System.out.print("Introduce el segundo numero: ");

        int n2 = sc.nextInt();
    
        sc.close();

        resta(n1, n2);

    }

    public static void resta(int n1, int n2) {

        if (n1 < n2) {

            for (int i = n1; i < n2; i++) {

                System.out.println(i);

            }

        } else if (n1 > n2) {

            for (int i = n1; i > n2; i--) {

                System.out.println(i);

            }

        }

    }

}
