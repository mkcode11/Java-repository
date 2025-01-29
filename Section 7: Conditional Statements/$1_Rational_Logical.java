import java.util.*;

public class $1_Rational_Logical {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num=sc.nextInt();

        if(num==0){
            System.out.println("Number is Zero.");
        }
        else if(num>0 && num!=0){
            System.out.println(num +" is Positive.");
        }
        else{
            System.out.println(num +" is Negative.");
        }
    }
}
