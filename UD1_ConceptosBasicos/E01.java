package UD1_ConceptosBasicos;

import java.util.*;

public class E01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("introduce un numero: ");

        int num = sc.nextInt();

        if ((num % 2) == 0) {

            System.out.println("el numero es par");
        }
        if ((num % 2) != 0) {

            System.out.println("el numero no es par");
        }
        
        sc.close();
      
    }
    
}
