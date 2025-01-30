import java.util.*;
public class v63_StudentChallenge1_1_NameOfDayBasedOnNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Day Number : ");
        int day=sc.nextInt();

        if(day==1){
            System.out.println("Day is Monday.");
        }
        else if(day==2){
            System.out.println("Day is Tuesday.");
        }
        else if(day==3){
            System.out.println("Day is Wednesday.");
        }
        else if(day==4){
            System.out.println("Day is Thursday.");
        }
        else if(day==5){
            System.out.println("Day is Friday.");
        }
        else if(day==6){
            System.out.println("Day is Saturday.");
        }
        else if(day==7 || day==0){
            System.out.println("Day is Sunday.");
        }
        else {
            System.out.println("Invalid Number.");
        }
    }
}
