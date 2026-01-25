/*
 3. Realizar una función que calcule y muestre el área o el volumen de un cilindro,
según se especifique. Para distinguir un caso de otro se le pasará como opción un
número: 1 (para el área) o 2 (para el volumen). Además, hay que pasarle a la
función el radio de la base y la altura.
 */

package UD3_Funciones;

import java.util.Scanner;

public class E03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        double radio = 0;

        double altura = 0;

        do {

            System.out.println("Indique la operación a realizar \n 1. Área \n 2. Volumen ");

            if (sc.hasNextInt()) { // Verifica que el dato introducido sea un Int dando una respuesta boolean true
                                   // o false

                opcion = sc.nextInt();

                // sc.nextLine(); // Limpia el buffer si por error no se ha metido un Int
                if (opcion != 1 && opcion != 2) { // ahora comprueba que esté dentro del rango

                    System.out.println("Error: Introduzca un numero valido ( 1 o 2 )");

                    // sc.nextLine();
                }

            } else {

                System.out.println("Error: Introduzca un numero valido ( 1 o 2 )");

                sc.nextLine(); // Limpia el buffer si por error no se ha metido un Int

            }

        } while (opcion != 1 && opcion != 2);

        do {

            System.out.println("Introduzca el radio (valor decimal) : ");

            while (!sc.hasNextDouble()) {

                System.out.println("Error: El valor introducido tiene que ser decimal");

                sc.next(); // descarta la entrada no valida

                System.out.println("Introduzca el radio (valor decimal) : ");

            }
            // Una vez pasado el filtro se guarda el valor de la variable radio
            radio = sc.nextDouble();

            sc.nextLine(); // limpia buffer scanner

        } while (radio < 0);

        do {

            System.out.print("Introduzca la altura: ");

            while (!sc.hasNextDouble()) {

                System.out.println("Error: El valor introducido tiene que ser decimal");

                sc.next(); // descarta la entrada no valida

                System.out.println("Introduzca la altura (valor decimal) : ");

            }
            // Una vez pasado el filtro se guarda el valor de la variable altura

            altura = sc.nextDouble();

            sc.nextLine(); // limpia el bufer del scanner

        } while (altura <= 0);

        operacion(opcion, radio, altura);

        sc.close();

    }

    static void operacion(int opcion, double radio, double altura) {

        if (opcion == 1) {

            double area = 2 * Math.PI * radio * (altura + radio);

            System.out.printf("El valor del área es: %.2f ", area);

        } else if (opcion == 2) {

            double volumen = Math.PI * Math.pow(radio, 2) * altura;

            System.out.printf("El volumen del cilindro es: %.2f ", volumen);

        }

    }

}
