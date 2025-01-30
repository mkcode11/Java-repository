import java.util.*;
public class v62_StudentChallenge1_1_RadixOfaNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a Number : ");
        String str=sc.next();

        if(str.matches("[0-1]+")){
            System.out.println("Binary Radix is 2.");
        }
        else if(str.matches("[0-7]+")){
            System.out.println("Octal Radix is 8.");
        }
        else if(str.matches("[0-9]+")){
            System.out.println("Decimal Radix is 10.");
        }
        else if(str.matches("[0-9A-F]+")){
            System.out.println("Hexa-Decimal Radix is 16");
        }
        else{
            System.out.println("Not a Number.");
        }
    }
}
