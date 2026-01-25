import java.util.Arrays;

public class E02_apuesta {
    
    public static void main(String[] args) {


        
    }

    static int aciertos (int arrApuesta[], int arrWin[]){

       
        int count = 0;

        for (int i = 0; i < arrWin.length; i++) {

            for (int j = 0; j < arrApuesta.length; j++) {

                if(arrWin[i]==arrApuesta[j]){

                    count++;

                    break;


                }
                
            }

            
        }

        return count;
    }
}
