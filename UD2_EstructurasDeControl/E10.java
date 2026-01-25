/*3. Crear un programa para calcular datos estadísticos de las edades de los alumnos 
de un centro educativo. Se introducirán datos hasta que uno de ellos sea negativo, 
y se mostrará: la suma de todas las edades introducidas, la media, el número de 
alumnos y cuántos son mayores de edad.
 */
package UD2_EstructurasDeControl;

import java.util.Scanner;

public class E10 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//Inicio del scanner

        System.out.println("Introduce la edad del alumno: ");//iniciamos la peticion al usuario

        int edad = sc.nextInt();// declaracion variable edad con scanner
        
        /* iniciamos el bloque de variables ( no podemos ponerlas dentro del bucle por que se inician infinitamente
 y nunca guardarian el registro anterior).     
         */
        int alumno = 0;

        int sumaEdad = 0;

        int mayorEdad = 0;//Iniciamos el bucle.

        while (edad > 0) {

            if (edad >= 18) {// condicional que solo se ejecuta si el alumno es mayor o igual a 18 años

                mayorEdad++;//modificacion variable mayorEdad
            }

            alumno++;//modificacion variable alumno

            sumaEdad += edad;//modificacion variable edad

            double edadMedia = sumaEdad / alumno; // declaracion variable  edadMedia

            System.out.println("Los alumnos registrados son: " + alumno); //imprimir registro alumno

            System.out.println("La suma de edades es: " + sumaEdad); //imprimir registro sumaEdad

            System.out.println("La edad media es: " + edadMedia); //imprimir registro edadMedia

            System.out.println("Los alumnos mayores de 18 años son :" + mayorEdad); //imprimir registro mayorEdad

            System.out.println("Introduce la edad del alumno"); //Peticion al usuario

            edad = sc.nextInt(); //nueva variable edadó

        }
        sc.close();
    }
    
}
