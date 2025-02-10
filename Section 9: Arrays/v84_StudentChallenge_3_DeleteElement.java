import java.util.Scanner;

public class v84_StudentChallenge_3_DeleteElement {
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

        System.out.print("Enter Index : ");
        int index=sc.nextInt();

        for(int i=index;i<Array.length-1;++i){
            Array[i]=Array[i+1];
        }


        for(int x:Array){
            System.out.print(x+", ");
        }


    }
}
