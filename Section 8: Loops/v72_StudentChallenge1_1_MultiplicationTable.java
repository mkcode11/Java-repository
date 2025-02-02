import java.util.*;
public class v71_StudentChallenge1_1_MultiplicationTable {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number : ");


        for(int i=1,num=sc.nextInt();i<=10;i++){

            System.out.println(num +" x "+ i +" = "+ (num*i));
        }
    }
}
