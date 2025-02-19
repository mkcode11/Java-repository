class Cylinder2{
    private double radius;
    private double height;
    private double PI= Double.parseDouble(String.format("%.2f",Math.PI));
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        if(r>=0){
            radius=r;
        }
        else{
            radius=1;
        }
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double h){
        if(h>=0){
            height=h;
        }
        else{
            height=1;
        }
    }

    public Cylinder2(){
        setRadius(-1);
        setHeight(-1);
        area();
    }
    public Cylinder2(double r){
        setRadius(r);
        setHeight(-1);
        area();
    }
    public Cylinder2(double r,double h){
        setRadius(r);
        setHeight(h);
        area();
    }
    public void area(){
         System.out.println("Area is : "+String.format("%.2f",PI*radius*radius*height));
    }
}
public class v116_StudentChallenge_1_classCylinderUsingConstructor {
    public static void main(String ...args){
        Cylinder2 c2=new Cylinder2();
        Cylinder2 c3=new Cylinder2(3);
        Cylinder2 c4=new Cylinder2(10,5);


    }
}
