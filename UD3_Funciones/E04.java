package UD3_Funciones;

import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero");

        int numb1 = sc.nextInt();

        System.out.println("Introduce el segundo numero");

        int numb2 = sc.nextInt();

        System.out.println("El numero mayor es: " + maximo(numb1, numb2));

        sc.close();

    }

    static int maximo(int m1, int m2) {

        int max;

        if (m1 < m2) {

            max = m2;

        } else {

            max = m1;

        }
        return max;
    }
}
