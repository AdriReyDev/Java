/*
 3. Pedir 10 números enteros por teclado y mostrar la media.
 */

package UD2_EstructurasDeControl;

import java.util.Scanner;

public class E06 {

    public static void main(String[] args) {
        
        Scanner sc = new  Scanner(System.in);
        
        int number = 0;
        
        int count = 0;
        
        double media = 0;
        
        for (int i = 1; i < 10; i++) {
            
            System.out.println("Introduce un numero: ");
         
            number = sc.nextInt();
            
            count += number;
            
            media = count / i;
  
        }
        System.out.println(media);

        sc.close();
    }
    
}
