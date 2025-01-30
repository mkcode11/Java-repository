import java.util.*;
public class v62_StudentChallenge1_2_LeapYear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Year : ");
        int year=sc.nextInt();

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println(year+" is a Leap Year.");
                }
                else{
                    System.out.println(year+" is Not a Leap Year.");
                }
            }
            else{
                System.out.println(year+" is a Leap Year.");
            }
        }
        else{
            System.out.println(year+" is Not a Leap Year.");
        }
    }
}
