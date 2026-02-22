/*5. Debes desarrollar una aplicación que ayude a gestionar las notas de un centro educativo.
Los alumnos se organizan en grupos compuestos por 5 personas. 
Leer las notas (números enteros) del primer, segundo y tercer trimestre de un grupo. Debes mostrar al final la nota
media del grupo en cada trimestre y la media del alumno que se encuentra en una posición
dada (que el usuario introduce por teclado). */

package EjerciciosFinalesArrays;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class E05 {

    // ********** Función para leer las notas **********

    static void leerNotas(int[][] alumnos) {

        double media = 0;
        System.out.println("\n---Notas primer trimestre---\n");
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j <= 0; j++) {

                System.out.println("        Alumno: " + (i + 1) + " = " + alumnos[i][j] + " ");
                media = media + alumnos[i][j];
            }
        }
        System.out.println("\nNota media del grupo primer trimestre = " + media / 5);

        media = 0;
        System.out.println("\n---Notas segundo trimestre---\n");
        for (int i = 0; i < 5; i++) {

            for (int j = 1; j <= 1; j++) {

                System.out.println("       Alumno: " + (i + 1) + " = " + alumnos[i][j] + " ");
                media = media + alumnos[i][j];
            }
        }
        System.out.println("\nNota media del grupo segundo trimestre = " + media / 5);

        media = 0;
        System.out.println("\n---Notas tercer trimestre---\n");
        for (int i = 0; i < 5; i++) {

            for (int j = 2; j <= 2; j++) {

                System.out.println("        Alumno: " + (i + 1) + " = " + alumnos[i][j] + " ");
                media = media + alumnos[i][j];
            }
        }
        System.out.println("\nNota media del grupo tercer trimestre = " + media / 5);
    }

    // * Función para operación nota media por alumno seleccionado*

    static void mediaNotaAlumnSelec(int numeroAlumno, int[][] alumnos) {

        double media = 0;

        for (int i = numeroAlumno; i <= numeroAlumno; i++) {

            for (int j = 0; j <= 2; j++) {
                
                media = media + alumnos[i][j];
            }

        }
        System.out.printf("\n---Nota media del alumno %d = %.1f \n", numeroAlumno, media / 3);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] alumnos = new int[5][3];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                Random rnd = new Random();
                int nota = rnd.nextInt(10);
                alumnos[i][j] = nota;
            }
        }

        // ******Notas de alumnos*******

        /*
         * for (int[] is : alumnos) {
         * 
         * System.out.println(Arrays.toString(is));
         * 
         * }
         */

        leerNotas(alumnos);

        System.out.print("Introduce el numero del alumno para ver su nota media: ");

        int numeroAlumno = sc.nextInt();
        numeroAlumno = numeroAlumno - 1;

        mediaNotaAlumnSelec(numeroAlumno, alumnos);

    }

}
