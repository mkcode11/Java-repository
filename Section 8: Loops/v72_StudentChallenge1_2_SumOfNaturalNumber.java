import java.util.*;
public class v71_StudentChallenge1_2_SumOfNaturalNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number : ");

        int sum=0,num=sc.nextInt();

        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println("Sum of "+num+" Natural Number is "+sum);
    }
}
