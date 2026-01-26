import java.util.Scanner;
public class ArrayBusquedaSecuencial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] arr = new int [] {2,4,65,345,23,43,5,63,2};

        int i = 0;

        System.out.println("Introduce la clave de busqueda: ");

        int searchKey = sc.nextInt();

        while(i < arr.length && arr[i] != searchKey){

            i++;

        }

        if (i < arr.length) {

            System.out.println("Clave de busqueda se encuentra en el indice: " + i);
            
        }else{

            System.out.println("Indice fuera de rango (no encontrado)");

        }
        sc.close();

        
    }
    
}
 