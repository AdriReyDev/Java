package UD3_Funciones;

import java.util.Scanner;

public class E05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero");

        int numb1 = sc.nextInt();

        System.out.println("Introduce el segundo numero");

        int numb2 = sc.nextInt();

        System.out.println("Introduce el tercer numero");

        int numb3 = sc.nextInt();

        System.out.println("El numero mayor es: " + maximo(numb1, numb2, numb3));

        sc.close();

    }

    static int maximo(int m1, int m2, int m3) {

        int max;

        int max1 = Math.max(m1, m2);

        int max2 = Math.max(max1, m3);

        if (max1 < max2) {

            max = max2;

        } else {

            max = max1;

        }
        return max;
    }

}
