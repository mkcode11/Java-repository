import java.lang.*;
import java.util.*;

class StudentChallange
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		sc.useRadix(2);

		System.out.println("Enter Your First Name :");
		String Fname = sc.next();
		
		System.out.println("Enter Your Last Name :");
		String Lname = sc.next();
		
		System.out.println(Fname + " Enter A Binary number : ");
		int x = sc.nextInt();

		
		System.out.println("Welcome " + Fname +" "+ Lname +" : "+ x);

	}
}