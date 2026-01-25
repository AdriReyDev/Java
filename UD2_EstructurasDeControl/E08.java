/*
 5. Crear un programa que muestre la suma de los 10 primeros números impares.
 */
package UD2_EstructurasDeControl;

public class E08 {
        public static void main(String[] args) {
        
         int count = 0;
        
        for (int i = 0; i < 20; i++) {
  
            if( i % 2 != 0)  count +=i;
 
        }
        System.out.println(count);
    }
    
}
