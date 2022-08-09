import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first String: ");
        String string1=sc.next();
        System.out.println("Enter your second String: ");
        String string2=sc.next();
        String newString="";
        String mergedStrings = string1 + " " + string2;

        int length1= string1.length();
        int length2= string2.length();
        int length3= mergedStrings.length();
        System.out.println("The length of the First String \""+string1+"\" is: " +length1);
        System.out.println("The length of the Second String \""+string2+"\" is: " +length2);

        System.out.println("Strings are merged: " +mergedStrings);

        String  a[]=mergedStrings.split("@",1);
        for(String i:a){
            System.out.println("Split String is " +i);
        }

        for (int i=0; i<length3; i++) {
            char ch = mergedStrings.charAt(i);
            newString = ch + newString;
        }
        System.out.println("Reversed word: "+ newString);

        if(string1.equalsIgnoreCase(string2))
        {
            System.out.println("Strings are Equal");
        }
        else{
            System.out.println("Strings are not Equal");
        }
    }
}
