import java.util.*;
public class v61_EvenOrOdd_StudentChallenge1_1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num=sc.nextInt();

        if(num%2==0){
            if(num==0){
                System.out.println("Number is Zero.");
            }
            else{
                System.out.println(num+" is Even.");
            }
        }
        else{
            System.out.println(num+" is Odd.");
        }
    }
}
