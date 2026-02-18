/*4. El ayuntamiento de tu localidad te ha encargado una aplicación que ayude a realizar
encuestas estadísticas para conocer el nivel adquisitivo de los habitantes del municipio. Para
ello, tendrás que preguntar el sueldo a cada persona encuestada. A priori, no conoces el
número de encuestados. Para finalizar la entrada de datos, introduce un sueldo con valor –1.
Una vez terminada la entrada de datos, muestra la siguiente información:
 Todos los sueldos introducidos ordenados de forma decreciente.
 El sueldo máximo y mínimo.
 La media de los sueldos.*/

package EjerciciosFinalesArrays;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class E04 {

  //FUNCION SUELDOS DECRECIENTES
  static Integer[] sueldosDecreciente(Integer[] sueldos) {

    Integer[] copySueldos = Arrays.copyOf(sueldos, sueldos.length);
    Arrays.sort(copySueldos, Collections.reverseOrder());

    return copySueldos;
  }

  //FUNCION SUELDOS MAXIMO Y MINIMO
  static Integer[] sueldosMaxMin(Integer[] sueldos) {

    Integer[] copySueldos = Arrays.copyOf(sueldos, sueldos.length);
    Integer[] maxMin = new Integer[2];

    int max = copySueldos[0];
    int min = copySueldos[0];

    for (int i = 0; i < copySueldos.length; i++) {

      if (copySueldos[i] > max) {
        max = copySueldos[i];
      }
      maxMin[0] = max;
    }

    for (int j = 0; j < maxMin.length; j++) {

      if (copySueldos[j] < min) {
        min = copySueldos[j];
      }
      maxMin[maxMin.length-1] = min;
    }

    return maxMin;
  }

  //FUNCION MEDIA DE LOS SUELDOS
  static int sueldosMedia(Integer[] sueldos) {
    int media = 0;

    for (int i = 0; i < sueldos.length; i++) {
      media = media + sueldos[i];    
    }

    return media / sueldos.length -1;
  }

  //CLASE MAIN
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Integer[] sueldos = new Integer[0];

    int i = 0;

    System.out.printf("Introduce sueldo persona %d: ", i + 1);
    int salario = sc.nextInt();

    while (salario != -1) {

      i++;
      //EN CADA ITERACION DEL BUCLE SE CREA UNA COPIA DEL ARRAY Y SE SUMA UN INDICE
      sueldos = Arrays.copyOf(sueldos, sueldos.length + 1);

      //LA ULTIMA POSICION DEL ARRAY RECIBE EL NUEVO DATO INTRODUCIDO
      sueldos[sueldos.length - 1] = salario;

      //SE VUELVE A LANZAR EL MENSAJE PARA INTRODUCIR EL SIGUIENTE DATO
      System.out.printf("Introduce sueldo persona %d: ", i + 1);
      salario = sc.nextInt();

    }

    //IMPRESION EN PANTALLA DE LA PETICION DE DATOS
    System.out.println();
    System.out.println("----Lista sueldos decrecientes----");
    System.out.println(Arrays.toString(sueldosDecreciente(sueldos)));
    System.out.println();
    System.out.println("---Sueldo maximo y Sueldo minimo---");
    System.out.println(Arrays.toString(sueldosMaxMin(sueldos)));
    System.out.println();
    System.out.println("---Media de sueldos---");
    System.out.println(sueldosMedia(sueldos));
    System.out.println();

    sc.close();
  }

}
