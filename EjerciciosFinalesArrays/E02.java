package EjerciciosFinalesArrays;

/*2. Escribe la función void  desordenar(int  t[]), que cambia de forma aleatoria los 
elementos contenidos en el array t. Si el array estuviera ordenado, dejaría de estarlo. 
 */
import java.util.Random;
public class E02 {
    public static void main(String[] args) {
       /*
        // 1. Creamos un array ordenado para ver claro el cambio
        int[] t = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        
        System.out.println("--- ESTADO INICIAL ---");
        System.out.println(Arrays.toString(t));
        
        // 2. Llamamos a tu función (recuerda: modifica el original)
        desordenar(t);
        
        System.out.println("\n--- TRAS DESORDENAR (Intento 1) ---");
        System.out.println(Arrays.toString(t));
        
        // 3. Probamos otra vez para asegurar que es aleatorio
        desordenar(t);
        
        System.out.println("\n--- TRAS DESORDENAR (Intento 2) ---");
        System.out.println(Arrays.toString(t));
        
        // VERIFICACIÓN VISUAL:
        // - No debe haber números repetidos (ej: dos 5).
        // - No debe faltar ningún número del 1 al 10.
        // - El orden debe ser distinto al inicial. */
       
        
    }
    static void desordenar(int t[]){

        Random r = new Random();      
        int i = 0;
        int copy = 0;

        while (i<t.length){
            //copy vale i (se guarda este valor para mas adelante)
            copy = t[i];
            //se genera un random con valor t.lenght
            int random = r.nextInt(t.length);
            //el valor de t[i] se cambia por el valor de t[random]
            t[i]=t[random];
            //ahora en el valor de t[random] recuperamos el valor inicial de i para no perderlo.
            t[random]=copy;
            i ++;
        }
    }
}
