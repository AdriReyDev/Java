/*3. Modifica la Actividad 2 para que la función no modifique el array que se pasa como
parámetro y, en su lugar, cree y devuelva una copia del array donde se han desordenado los
valores de los elementos. */
package EjerciciosFinalesArrays;

import java.util.Arrays;
import java.util.Random;

public class E03 {

     static int [] desordenar(int t[]){

        Random r = new Random();      
        int i = 0;
        int copy = 0;
        int[] copyT = Arrays.copyOf(t, t.length);

        while (i<t.length){
            //copy vale i (se guarda este valor para mas adelante)
            copy = t[i];
            //se genera un random con valor t.lenght
            int random = r.nextInt(t.length);
            //el valor de t[i] se cambia por el valor de t[random]
            copyT[i]=copyT[random];
            //ahora en el valor de t[random] recuperamos el valor inicial de i para no perderlo.
            copyT[random]=copy;
            i ++;
        }
        return copyT;
    }
public static void main(String[] args) {
    
     // 1. Creamos un array ordenado para ver claro el cambio
        int[] t = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        
        System.out.println("--- ESTADO INICIAL ---");
        System.out.println(Arrays.toString(t));
        
        // 2. Llamamos a tu función (recuerda: modifica el original)
        desordenar(t);
        
        System.out.println("\n--- TRAS DESORDENAR (Intento 1) ---");
        System.out.println(Arrays.toString(desordenar(t)));
        
        // 3. Probamos otra vez para asegurar que es aleatorio
        desordenar(t);
        
        System.out.println("\n--- TRAS DESORDENAR (Intento 2) ---");
        System.out.println(Arrays.toString(desordenar(t)));

        //Verificamos que t no ha cambiado
        System.out.println("\n--- Verificamos que t no se ha desordenado ---"); 
        System.out.println(Arrays.toString(t));

        
        // VERIFICACIÓN VISUAL:
        // - No debe haber números repetidos (ej: dos 5).
        // - No debe faltar ningún número del 1 al 10.
        // - El orden debe ser distinto al inicial.
}
    
}
