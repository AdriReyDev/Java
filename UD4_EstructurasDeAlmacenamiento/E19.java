/*3. Un programa debe generar automáticamente un mensaje a partir de distintos datos. Define
variables para el nombre de una persona, su edad y su ciudad. A partir de esos datos, construye
una frase con el formato: Nombre tiene X años y vive en Ciudad. El programa debe generar
el mensaje paso a paso y mostrar el resultado final por pantalla.. */

package UD4_EstructurasDeAlmacenamiento;

import java.util.Scanner;

public class E19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce nombre: ");
        String nombre = sc.next();
        System.out.println("Introduce años: ");
        int edad = sc.nextInt();
        System.out.println("Introduce ciudad: ");
        String ciudad = sc.next();

        System.out.printf("%s tiene %d años y vive en %s ",nombre,edad,ciudad);



        
    }
    
}
