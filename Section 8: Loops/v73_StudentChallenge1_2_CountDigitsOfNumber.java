import java.util.*;
public class v73_StudentChallenge1_2_CountDigitsOfNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num=sc.nextInt();
        int count=0;

        do{
            ++count;
            num/=10;
        }while(num!=0);

        System.out.println(count);

        /* OR
        String num=sc.next();
        System.out.println(num.length());
         */
    }
}
