/*
 3. Diseñar una función con el siguiente prototipo: boolean esPrimo (int n) que
devolverá true si n es primo y false en caso contrario.
 */
package UD3_Funciones;

import java.util.Scanner;

public class E07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = 1;
         boolean key = false; // se utilizara para validar el bucle if
        do {

            System.out.println("Introduce un numero entero para saber si es primo o no: ");
 
            if (sc.hasNextInt()) { // asegura que sea un INT
              
                numero = sc.nextInt();
                
                sc.nextLine(); // limpia el buffer
                
                key = true;  // cambia el valor a true y nos permite salir del bucle
                

            } else {

                System.out.println("El parametro introducido no es un numero entero");

                sc.nextLine();

            }
        } while (!key); // mientras que key != true el bucle se repite

          if (primo(numero)) {

            System.out.println("El numero introducido es un numero primo");

        } else {

            System.out.println("El numero introducido no es un numero primo");

        }

        sc.close();

    }

    static boolean primo(int numb) {

        if (numb < 2) { // primer filtro: filtra los numeros menores de 2

            return false;

        }
        for (int i = 2; i < numb; i++) { // segundo filtro: si numb retorna ==0 de resto en alguna de sus divisiones por numeros mas pequeños que él return = false

            if (numb % i == 0) {
                return false;

            }

        }
        return true; // si numb ha pasado todos los filtros return = true, el numero es primo
    }
    
}
