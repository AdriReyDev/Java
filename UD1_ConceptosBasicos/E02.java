package UD1_ConceptosBasicos;

import java.util.Scanner;

public class E02 {

     public static void main(String[] args) {

        // Solicitar dos números distintos y mostrar cuál es mayor. 
        //pedir tres números y ordenarlos de mayor a menor.
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");

        int num1 = sc.nextInt();

        System.out.println("Introduce otro numero: ");

        int num2 = sc.nextInt();

        if (num1 < num2) {

            System.out.println(num1 + " es menor que " + num2);
        } else if (num1 > num2) {

            System.out.println(num1 + " Es mayor que " + num2);
        } else {

            System.out.println(" Son iguales ");

        }

        sc.close();

    }
    
}
