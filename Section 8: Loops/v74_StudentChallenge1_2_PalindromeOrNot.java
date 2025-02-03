import java.util.*;
public class v74_StudentChallenge1_2_PalindromeOrNot {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num=sc.nextInt();
        int copy=num,reverse=0;

        while(num!=0){
            reverse=(reverse*10)+(num%10);
            num/=10;
        }

        if(reverse==copy){
            System.out.println(copy+" is Palindrome.");
        }
        else{
            System.out.println(copy+" is Not Palindrome.");
        }

    }
}
