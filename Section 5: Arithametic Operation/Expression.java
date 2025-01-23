import java.util.*;

class Expression2 {
    
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calculate Area By Method 2!");
        
        System.out.print("Enter First Side(a) : ");
        int a = sc.nextInt();
        
        System.out.print("Enter First Side(b) : ");
        int b = sc.nextInt();
        
        System.out.print("Enter First Side(c) : ");
        int c = sc.nextInt();
        
        double s = (a+b+c)/2.0;
        
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        System.out.println("Are of Triangle : " + area);
    
    }
    
}
