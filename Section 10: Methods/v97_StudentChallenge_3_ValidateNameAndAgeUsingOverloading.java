import java.util.*;
public class v97_StudentChallenge_3_ValidateNameAndAgeUsingOverloading {

    static boolean validate(String str){
        return str.matches("[a-zA-Z\\s]+");
    }
    static boolean validate(int num){
        return num>3 && num<=15;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Name : ");
        String name=sc.nextLine();

        System.out.print("Enter Age : ");
        int age=sc.nextInt();

        if(validate(name) && validate(age)){
            System.out.println("Allowed to take Admission");
        }
        else{
            System.out.println("Not Allowed to take Admission");
        }

    }
}
