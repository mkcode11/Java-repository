import java.util.Scanner;
public class v84_StudentChallenge_2_InsertElement {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        int[] Array=new int[10];

        Array[0]=1;
        Array[1]=2;
        Array[2]=3;
        Array[3]=4;
        Array[4]=5;
        Array[5]=6;

        for(int x:Array){
            System.out.print(x+", ");
        }
        System.out.println("");

        System.out.print("Enter Number & Index : ");
        int num=sc.nextInt();
        int index=sc.nextInt();

        for(int i=Array.length-2;i>=index;--i){
            Array[i]=Array[i-1];
        }
        Array[index]=num;

        for(int x:Array){
            System.out.print(x+", ");
        }






    }
}
