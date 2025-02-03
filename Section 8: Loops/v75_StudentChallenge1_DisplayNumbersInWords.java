import java.util.*;
public class v75_StudentChallenge1_DisplayNumbersInWords {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num=sc.nextInt();
        System.out.print("'"+num+"'"+" in Words is ");
        String number="";

        while(num!=0){
            number+=(num%10);
            num/=10;
        }

        for(int i=number.length()-1;i>=0;--i){
            char character=number.charAt(i);

            switch(character){
                case '0':System.out.print("Zero "); break;
                case '1':System.out.print("One "); break;
                case '2':System.out.print("Two "); break;
                case '3':System.out.print("Three "); break;
                case '4':System.out.print("Four "); break;
                case '5':System.out.print("Five "); break;
                case '6':System.out.print("Six "); break;
                case '7':System.out.print("Seven "); break;
                case '8':System.out.print("Eight "); break;
                case '9':System.out.print("Nine "); break;
                default:System.out.print("Not working "); break;
            }
        }

    }
}
