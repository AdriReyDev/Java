/*2. Una aplicación recibe la cadena "Cliente_Premium_Activo" y necesita comprobar si el tipo
de cliente que aparece en la cadena es "Premium". Escribe un programa que determine si ese
fragmento aparece exactamente en la posición correcta de la cadena y muestre por pantalla si el
cliente pertenece o no a ese tipo. */
package UD4_EstructurasDeAlmacenamiento;

public class E18 {
    public static void main(String[] args) {

        String clavePremium = "Premium";
        int initClave = 0;
        String cliente = "Cliente_Premium_Activo";
        int initCliente = 8;

        System.out.println("¿El cliente es premium?");
        System.out.println(cliente);

        if(clavePremium.regionMatches(initClave, cliente, initCliente, 7)){
            System.out.println("El cliente es premium");
        } else{
            System.out.println("El cliente no es premium");
        }



        
    }
    
}
