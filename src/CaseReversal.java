import java.util.Scanner;

public class CaseReversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your sentence here Vignesh: ");
        String sentence=sc.nextLine();
        StringBuffer newString=new StringBuffer(sentence);

        for(int i=0;i<sentence.length();i++){

            if(Character.isLowerCase(sentence.charAt(i))){
                newString.setCharAt(i, Character.toUpperCase(sentence.charAt(i)));
            }
            else if (Character.isUpperCase(sentence.charAt(i))) {
                newString.setCharAt(i, Character.toLowerCase(sentence.charAt(i)));

            }
        }
        System.out.println("Look at this magic, all cases are inversed!!!!  " + newString);
    }
}
