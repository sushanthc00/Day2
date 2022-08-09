import java.util.*;
public class OperationsArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int arr[]=new int[length];
        int sumOfElements=0;
        int TotalCount=0;
        int FrequentElement=0;
        int mean=0;
        int mode=0;
        int median=0;
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<length;i++){
            sumOfElements+=arr[i];
        }
        for(int i=0;i<length;i++){
            int countOfIterations=0;
            for(int j=0;j<length;j++){
                if(arr[i]==arr[j])
                    countOfIterations++;
            }
            if(countOfIterations>TotalCount){
                TotalCount=countOfIterations;
                FrequentElement=arr[i];
            }
        }
        mean=sumOfElements/length;
        mode=FrequentElement;
        median=arr[length/2];
        System.out.println("Mean is :"+mean);
        System.out.println("Medain is :" + median);
        System.out.println("Mode is :" +mode);
    }
}