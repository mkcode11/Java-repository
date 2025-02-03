import java.util.*;
public class v74_StudentChallenge1_1_ReverseTheNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num=sc.nextInt(),reverse=0;
        int copy=num;

        while(num!=0){

            reverse=(reverse*10)+(num%10);
            num/=10;

        }
        System.out.println(copy+" reverse is "+reverse);


    }
}
