import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length,breath,height; double volume,total_area;
        System.out.println("Calculate Total Area and Volume of Cuboid!");

        System.out.print("Enter Length : ");
        length =  sc.nextInt();

        System.out.print("Enter Breath : ");
        breath = sc.nextInt();

        System.out.print("Enter Height : ");
        height = sc.nextInt();

        total_area = 2 * ((length * height) + (height * breath) + (length * breath));
        volume = length*breath*height;

        System.out.println("Total Area of Cuboid : " + total_area);
        System.out.println("Volume of Cuboid : " + volume);



    }
}