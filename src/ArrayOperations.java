import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int arraySize = sc.nextInt();
        System.out.println("Enter the elements(numbers) for the array : ");
        int array[] = new int[arraySize];
        int total = 0, mean, temp = 0, median = 0, temp2 = 0, num_value = 0;
        for(int i=0;i<arraySize;i++){
            array[i]=sc.nextInt();

        }

        for (int i = 0; i < arraySize; i++) {
            total = total + array[i];
        }
        mean = total / arraySize;
        System.out.println("The mean of the numbers in the Array is: " + mean);

        if (arraySize % 2 == 0) {
            temp = (arraySize / 2) - 1;
            for (int j = 0; j < arraySize; j++) {
                if (temp == j || (temp + 1) == j) {

                    median = median + array[j];
                }
            }
            median = median / 2;
            System.out.println("Median value is: " + median);
        } else {
            temp2 = (num_value / 2);
            for (int i = 0; i < num_value; i++) {
                if (temp == i) {
                    median = array[i];
                    System.out.println("Median value: " + median);
                }


            }
        }
    }
}