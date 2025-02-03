import java.util.*;
public class v76_StudentChallenge1_1_Display_AP_Series {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Starting Number : ");
        int start=sc.nextInt();
        System.out.print("Enter Difference : ");
        int difference=sc.nextInt();
        System.out.print("Enter Total Number : ");
        int total=sc.nextInt();

        System.out.print("AP of "+start+" is : ");
        for(int i=1;i<=total;++i){
            System.out.print(start+", ");
            start+=difference;
        }
    }
}
