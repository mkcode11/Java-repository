class Rectangle{

    public int length;
    public int breath;

    public int area(){
        return length*breath;
    }
    public int parameter(){
        return 2*(length+breath);
    }
    public boolean isSquare(){
        return length==breath;
    }

}
public class v108_StudentChallenge_ClassForRectangle {
    public static void main(String ...args){

        Rectangle r1=new Rectangle();

        r1.length=8;
        r1.breath=8;

        System.out.println("Area is : "+r1.area());
        System.out.println("Parameter is : "+r1.parameter());
        System.out.println("isSquare : "+r1.isSquare());





    }
}
