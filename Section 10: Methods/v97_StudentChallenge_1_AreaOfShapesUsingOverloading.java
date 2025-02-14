public class v97_StudentChallenge_1_AreaOfShapesUsingOverloading {

    static int area(int x,int y){
        return x*y;
    }
    static double area(int r){
        return Math.PI*r*r;
    }
    public static void main(String[]args){

        System.out.format("Area is %.2f",area(20));
    }
}
