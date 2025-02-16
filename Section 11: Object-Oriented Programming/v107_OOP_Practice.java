class Circle{

    public int radius;

    public double area(){
        return Math.PI*radius*radius;
    }
    public double parameter(){
        return 2*Math.PI*radius;
    }

}
public class v107_OOP_Practice {
    public static void main(String ...args){

        Circle c1=new Circle();
        Circle c2=new Circle();

        c1.radius=7;
        c2.radius=14;


        System.out.format("Area1 is : %.2f",c1.area());
        System.out.format("\nArea2 is : "+c2.area());
        System.out.format("\nParameter is : %.2f",c1.parameter());
        System.out.format("\nParameter is : %.2f",c2.parameter());


    }
}
