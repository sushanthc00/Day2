import java.util.Scanner;

public class StudentsMarks {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Students ");
        int numberOfStudents=sc.nextInt();
        System.out.println("Enter the number of Subjects ");
        int numberOfSubjects=sc.nextInt();
        int total =0;

        int[][] marksGrid = new int[numberOfStudents][numberOfSubjects];
        int[] totalMarks = new int[numberOfStudents];
        int[] rank = new int[numberOfSubjects];

        for (int i=0;i<numberOfStudents;i++){
            System.out.println("Enter the marks of Student " + (i+1) + " : ");

            for(int j=0;j<numberOfSubjects;j++){
                marksGrid[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<numberOfStudents;i++){
            for(int j=0;j<numberOfSubjects;j++){
                total += marksGrid[i][j];
            }
            System.out.println("Total marks of Student " + (i+1) + " is "  +total);
            System.out.println();
            totalMarks[i] = total;
            total = 0;
        }

        for(int i=0;i<numberOfStudents;i++){
            int count=0;
            for(int j=0;j<numberOfSubjects;j++){
                if(totalMarks[j]>totalMarks[i]){
                    count++;
                }
            }
            rank[i]=count+1;
        }

        for(int i=0;i<numberOfStudents;i++) {
            System.out.println("Rank of student " + (i + 1) + " is : " + rank[i]);
            System.out.println();
        }

        for(int i=0;i<numberOfStudents;i++){
            if(rank[i]==1){
                System.out.println("The topper of the class is : student "+(i+1));
                System.out.println();
            }
            if(rank[i]==2){
                System.out.println("The student with second highest score is : student "+(i+1));
            }
            if(rank[i]==3){
                System.out.println("Top 3 Student is : student "+(i+1));
            }
        }

        for(int i=0;i<numberOfStudents;i++){
            for(int j=0;j<numberOfSubjects;j++){
                if(marksGrid[i][j]<50){
                    System.out.println("Student "+(i+1)+ " has performed below average in  Subject number " + (j+1) + " and has a total of "+ totalMarks[i]);
                    System.out.println();
                }
            }
        }

        for(int i=0;i<totalMarks.length;i++){
            total=total+totalMarks[i];
        }
        System.out.println("Overall class average is: "+ (total/numberOfStudents));

    }
}
