import java.util.Arrays;
import java.util.Scanner;
public class ArraysBinarySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[] {34,98,45,9,4,-4,939,85,2,1,5,3,8,7};

        System.out.println("Introduce la clave de busqueda: ");

        int sk = sc.nextInt();

        sc.close();
// Ordena el Array desordenado
        Arrays.sort(arr);

 /*  Imprime en pantalla para comprobar los indices

    for (int i : arr) {

    System.out.println(i);
    
   }*/  
        
    // Imprime el indice de la clave de busqueda
        System.out.println(Arrays.binarySearch(arr,sk));
      
    }
    
}
