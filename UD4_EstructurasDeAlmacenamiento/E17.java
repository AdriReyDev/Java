/*1. Un sistema debe comprobar si dos códigos introducidos en el programa representan el mismo
identificador aunque uno esté escrito con mayúsculas y otro con minúsculas. Define dos cadenas
con valores como "ABc123" y "abc123" y escribe un programa que determine si representan el
mismo código. El programa debe mostrar por pantalla si el identificador es válido o no. */

package UD4_EstructurasDeAlmacenamiento;

public class E17 {
    public static void main(String[] args) {
        
        String cadena1 = "ABc123";
        String cadena2 = "abc123";

        System.out.println(cadena1);
        System.out.println(cadena2);

        if(cadena1.equalsIgnoreCase(cadena2)){
            System.out.println("Representan el mismo código");
        }else{
            System.out.println("No representan el mismo código");
        }

        
    }
    
}
