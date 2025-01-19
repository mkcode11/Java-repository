import java.lang.*;
import java.util.*;

class Add
{
	public static void main(String args[])
	{	
		Scanner s = new Scanner(System.in);

		int a,b,c;

		System.out.println("Enter Num1 : ");
		a = s.nextInt();
		System.out.println("Enter Num2 : ");
		b = s.nextInt();
		c=a+b;
		System.out.println("Sum is " + c);		
		
	}
}