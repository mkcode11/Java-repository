import java.util.*;
public class v76_StudentChallenge1_3_Fibonacci {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);


        System.out.print("Enter Total Number : ");
        int total=sc.nextInt();
        long a=0,b=1;

        System.out.print("Fibonacci Series is "+a+", "+b+", ");
        for(int i=1;i<=total;++i){
            long c=a+b;
            System.out.print(c+", ");
            a=b;
            b=c;
        }


    }
}
