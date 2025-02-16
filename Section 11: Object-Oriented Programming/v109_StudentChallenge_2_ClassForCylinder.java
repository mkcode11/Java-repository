//import java.text.DecimalFormat;

class Cylinder{
//    DecimalFormat df=new DecimalFormat("#.00");
    public double height;
    public double radius;
    private double PI=Double.parseDouble(String.format("%.2f",Math.PI));

    public double lidArea(){
        return PI*radius*radius;
    }
    public double totalSurfaceArea(){
        return 2*lidArea()+circumference()*height;
    }
    public double circumference(){
        return 2*radius;
    }
    public double volume(){
        return lidArea()*height;
    }

}
public class v109_StudentChallenge_2_ClassForCylinder {
    public static void main(String ...args){

        Cylinder c1=new Cylinder();

        c1.radius=8.53;
        c1.height=14;

        System.out.println("Area : "+c1.lidArea());
        System.out.println("Total Face Area : "+String.format("%.2f",c1.totalSurfaceArea()));
        System.out.println("Circumference : "+c1.circumference());
        System.out.println("Volume : "+c1.volume());

    }
}
