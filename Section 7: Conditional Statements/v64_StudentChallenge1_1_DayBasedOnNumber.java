import java.util.*;
public class v64_StudentChallenge1_1_DayBasedOnNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number : ");
        byte num=sc.nextByte();

        switch(num){
            case 1 : System.out.println("Mon"); break;
            case 2 : System.out.println("Tue"); break;
            case 3 : System.out.println("Wed"); break;
            case 4 : System.out.println("Thurs"); break;
            case 5 : System.out.println("Fri"); break;
            case 6 : System.out.println("Sat"); break;
            case 7 : System.out.println("Sun"); break;
            default : System.out.println("Invalid");
        }
    }
}
