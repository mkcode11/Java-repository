import java.util.*;
import static java.lang.Math.pow;

public class v73_StudentChallenge1_3_ArmstrongOrNot {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num=sc.nextInt(),armStrong=0,count=0;
        int copy=num;


        while(num!=0){
            ++count;
            num/=10;
        }

        num=copy;
        while(num!=0){

            armStrong+=pow((num%10),count);
            num/=10;
        }

        if(copy==armStrong){
            System.out.println(copy+" is a ArmStrong Number.");
        }
        else{
            System.out.println(copy+" is Not a ArmStrong Number.");
        }
    }
}
