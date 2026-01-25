package UD2_EstructurasDeControl;

import java.util.Scanner;

public class E02 {
 /*pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma: insuficiente (de 0 
a 4), suficiente (5), bien (6), notable (7 y 8) y sobresaliente (9 y 10). */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la nota obtenida: ");

        int nota = sc.nextInt();

        String resultado = "";

        resultado = switch (nota) {

            case 1, 2, 3, 4 ->
                "insuficiente";
            case 5, 6 ->
                "aprobado";
            case 7, 8 ->
                "notable";
            case 9, 10 ->
                "sobresaliente";
            default ->
                "La nota introducida no es valida";

        };

        System.out.println("El resultado obtenido es: " + resultado.toUpperCase());

        sc.close();

    }

    
}
