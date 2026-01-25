package UD2_EstructurasDeControl;

import java.util.Scanner;

public class E01 {

     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero de un dia de la semana: ");

        int num = sc.nextInt();

        String diaSemana = switch (num) {

            case 1 ->
                "Lunes";
            case 2 ->
                "Martes";
            case 3 ->
                "Miercoles";
            case 4 ->
                "Jueves";
            case 5 ->
                "Viernes";
            case 6 ->
                "Sabado";
            case 7 ->
                "Domingo";
            default ->
                "No existe ese dia de la semana";
        };
        
        System.out.println("Ese dia de la semana es " + diaSemana);

        sc.close();
    }   
        
}
