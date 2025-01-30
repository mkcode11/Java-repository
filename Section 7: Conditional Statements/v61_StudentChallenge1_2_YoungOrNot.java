import java.util.*;
public class v61_YoungOrNot_StudentChallenge1_2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Age : ");
        int age=sc.nextInt();

        if(age>=14 && age<=55){
            System.out.println("You'er Young.");
        }
        else{
            System.out.println("stfu");
        }

    }
}
