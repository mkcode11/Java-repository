public class v90_MethodPractice {
    int max_num(int x,int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
    public static void main(String[]args){
        int a=200,b=90;

        v90_MethodPractice methodObject = new v90_MethodPractice();
        int c = methodObject.max_num(a,b);

        System.out.println("Max : "+c);
    }
}
