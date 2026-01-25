package UD2_EstructurasDeControl;

import java.util.Scanner;
import java.util.Arrays;
public class E13 {
    
    //pedir tres números y ordenarlos de mayor a menor.
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pide un numero: ");
        
        int num1 = sc.nextInt();
        
        System.out.println("Pide el segundo numero: ");
        
        int num2 = sc.nextInt();
        
        System.out.println("Pide el tercer numero: ");
        
        int num3 = sc.nextInt();

        int[] arrNum = new int[] {num1,num2,num3};

        Arrays.sort(arrNum);

        sc.close();
                           
    }
}
