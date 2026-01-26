/*
4. Crear un programa que pida al usuario un número comprendido entre 1 y 10. Hay que
mostrar la tabla de multiplicar de dicho número, asegurándose de que el número
introducido se encuentra en el rango establecido.
 */
package UD2_EstructurasDeControl;

import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero del 1 al 10 y te muestro su tabala de multiplicar: ");
                     
         int number = sc.nextInt();
         
         int count = 1;
         
         int multiplicador = 1;
     
        if (number <= 10){
            
            for (int i = 1; i <=  10  ; i++) {
                
                 count = number*i;
                             
                System.out.printf("%d x %d = %d\n",number,multiplicador,count);
                
                multiplicador ++;
       
            }
        
        }else{
        
            System.out.println("Numero fuera de rango");
        }
        sc.close();
    }
    
}
