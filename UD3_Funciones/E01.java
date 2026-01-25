/*
Diseña la función eco() a la que se le pasa como parámetro un número n y
muestra por pantalla n veces el mensaje “Eco…”
 */

package UD3_Funciones;

import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
             
             System.out.println("Escribe el  numero de veces que se escribira la palabra eco");
             
            int n = sc.nextInt();
        
            eco(n);

            sc.close();
  
        }
 public static void eco(int numero ) {
           
            
             for (int i = 0; i < numero ; i++) {
                 
                 System.out.println("eco");
                  }  
        }
    
}
