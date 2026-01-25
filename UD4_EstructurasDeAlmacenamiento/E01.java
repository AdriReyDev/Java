/*
 Crea un array de longitud 10 que se inicializará con números aleatorios
comprendidos entre 1 y 100. Mostrar la suma de todos los números aleatorios
que se guardan en el array.
Recordatorio: (int)(Math.random() * (max - min + 1)) + min
 */
package UD4_EstructurasDeAlmacenamiento;

public class E01 {
    public static void main(String[] args) {

        int[] aleatorios = new int[10];

        int min = 1;

        int max = 50;

        int suma = 0;

        for (int i = 0; i < aleatorios.length; i++) {

            aleatorios[i] = (int) (Math.random() * (max - min + 1)) + min;

            suma = suma + aleatorios[i];
            
            if (i == aleatorios.length - 1) {
                
                System.out.print(aleatorios[i]);
                
            } else {
                
                System.out.print(aleatorios[i]);
                
                System.out.print(" + ");
            }

        }
        System.out.print(" = ");
        
        System.out.println(suma);

    }
    
}
