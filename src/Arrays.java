import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int array[] = {35,37,38,17,48,12,45,26,34,28};
        int size= array.length;
        int hold;

        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(array[i]>array[j]){
                    hold = array[i];
                    array[i] = array[j];
                    array[j] = hold;
                }
            }
        }
        System.out.println("Highest marks is " + array[size-1]);


    }
}
