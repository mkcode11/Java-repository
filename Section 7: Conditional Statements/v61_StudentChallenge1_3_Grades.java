import java.util.*;
public class v61_StudentChallenge1_3_Grades {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics Marks : ");
        int marks1=sc.nextInt();
        System.out.print("Enter Chemistry Marks : ");
        int marks2=sc.nextInt();
        System.out.print("Enter Maths Marks : ");
        int marks3=sc.nextInt();

        float avg=(marks1+marks2+marks3)/3f;

        if(avg>=70){
            System.out.println("Grade : A ");
        }
        else if(avg>=60){
            System.out.println("Grade : B ");
        }
        else if(avg>=50){
            System.out.println("Grade : C ");
        }
        else if(avg>=40){
            System.out.println("Grade : D ");
        }
        else{
            System.out.println("Grade : Fail ");
        }



    }
}
