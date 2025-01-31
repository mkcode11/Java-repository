import java.util.*;
public class v65_StudentChallenge1_JavaCalculator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Menu\n====\nAdd\nSub\nMul\nDiv\nEnter Two Numbers : ");
        byte num1=sc.nextByte();
        byte num2=sc.nextByte();
        sc.nextLine();

        System.out.print("Enter Option : ");
        String option=sc.nextLine();
        option=option.toLowerCase();

        switch(option){
            case "add": System.out.println(num1+num2); break;
            case "sub": System.out.println(num1-num2); break;
            case "mul": System.out.println(num1*num2); break;
            case "div": System.out.println(num1/num2); break;
            default: System.out.println("Invalid"); break;
        }

    }
}
