import java.util.*;
public class v73_StudentChallenge1_1_DisplayDigitsOfNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num=sc.nextInt();

        do{
            System.out.println(num%10);
            num/=10;
        }while(num!=0);
    }

}
