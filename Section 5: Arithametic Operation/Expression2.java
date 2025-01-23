import java.util.*;

public class Expression2 {
    
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);
        
        int a,b,c; double r1,r2;
        
        System.out.println("Calculate Quadratic Equation!");
        
        System.out.print("Enter First Side(a) : ");
        a = sc.nextInt();
        
        System.out.print("Enter First Side(b) : ");
        b = sc.nextInt();
        
        System.out.print("Enter First Side(c) : ");
        c = sc.nextInt();
        
        double discreminent = Math.sqrt((b*b)-(4*a*c));
        int deno = 2*a;
        
        r1 = (-b + discreminent)/deno;
        r2 = (-b - discreminent)/deno;
        
       
        
        System.out.println("Root 1 : " + r1);
        System.out.println("Root 2 : " + r2);
    
    }
    
}