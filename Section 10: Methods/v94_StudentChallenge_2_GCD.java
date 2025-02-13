import java.util.*;
public class v94_StudentChallenge_2_GCD {
     static int gCD(int m,int n){
        while(m!=n){
            if(m>n){
                m-=n;
            }
            else{
                n-=m;
            }
        }
        return m;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter Two Number : ");
        int num=gCD(sc.nextInt(),sc.nextInt());

        System.out.println(num+" is GCD.");
    }
}
