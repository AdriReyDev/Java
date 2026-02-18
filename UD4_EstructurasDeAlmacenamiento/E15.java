/*2. Realiza un programa que pida al usuario un carácter por teclado y determine a qué tipo
pertenece, indicando si es una letra mayúscula, una letra minúscula, un número, un espacio en
blanco o cualquier otro tipo de carácter, utilizando los métodos de la clase Character.
package UD4_EstructurasDeAlmacenamiento;*/
package UD4_EstructurasDeAlmacenamiento;
import java.util.Scanner;

public class E15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un digito: ");
        char c = sc.nextLine().charAt(0);

        if ( Character.isDigit(c)) {
            System.out.println("Es un digito");
        } 
         if (Character.isLetter(c)) {
            System.out.println("Es una letra");
        } 
         if (Character.isLetterOrDigit(c)) {
            System.out.println("Es una letra o un digito"); 
        } 
         if(Character.isLowerCase(c)){
            System.out.println("Es minúscula");
        } 
         if(Character.isUpperCase(c)){
            System.out.println("Es mayúscula");
        } 
         if(Character.isSpaceChar(c)){
            System.out.println("Es un espacio en blanco");
        } 
        if (Character.isWhitespace(c)){
            System.out.println("Es cualquier caracer en blanco");
        }

        sc.close();
        
    }
    
}
