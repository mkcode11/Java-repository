import java.util.*;
public class v72_StudentChallenge1_3_FactorialOfNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number : ");
        long fact=1,num=sc.nextInt();

        for(int i=1;i<=num;++i){
            fact*=i;
        }

        System.out.println(num+"!="+fact);
    }
}
