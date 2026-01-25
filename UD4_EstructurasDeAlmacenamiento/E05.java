/*
 ORDENACION Y BUSQUEDA EN ARRAYS
 */
package UD4_EstructurasDeAlmacenamiento;

import java.util.Arrays;
import java.util.Scanner;

public class E05 {

    public static void main(String[] args) {
        
        //inicializacion para ejemplo
        Scanner sc = new Scanner(System.in);
        
        int [] t = new int[5];
        
        t[0] = 1;
        t[1] = 2;
        t[2] = 3;
        t[3] = 4;
        t[4] = 5;
        
        System.out.println("Introduce clave: ");
        
        int claveBusqueda = sc .nextInt();

        sc.close();
        
        
        //ORDENACION
        Arrays.sort(t);
        
        //BUSQUEDA
        
        //BUSQUEDA EN UN ARRAY NO ORDENADO (secuencial)
        /*Busqueda inicial*/
        
        int indiceBusqueda = 0; //Indice para recorrer tabla
        
        //Mientras indice de busqueda no es el ultimo elemento y no encontrado
       //Incrementamos el indice de busqueda.
        while (indiceBusqueda < t.length && t[indiceBusqueda] != claveBusqueda){
            
            indiceBusqueda ++;
        }
        
            if (indiceBusqueda < t.length){ // clave encontrada
            
                System.out.println(String.format("%d se encuentra en la posicion %d ",claveBusqueda,indiceBusqueda));
                
            }else { //el indice se ha salido de rango
            
                System.out.println("No encontrado");
                
            }
         
            //BUSQUEDA EN UN ARRAY ORDENADO
            
            Arrays.binarySearch(t, claveBusqueda);
            
            
        }
    
}
