package UD2_EstructurasDeControl;

/*1. Crear un programa para aprender a contar, que pedirá un número n y mostrará todos los
números del 1 a n.*/

import java.util.Scanner;

public class E03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un numero y contaremos desde el numero 1: ");

        int n = sc.nextInt();

        for (int i = 1; i < n + 1; i++) {

            System.out.println(i);

        }
        sc.close();
    }

}
