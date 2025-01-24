public class MagicSwap {

    public static void main(String[] args){

        int a=5,b=6;
        System.out.println("a = "+ a +" b = " + b);

        a=a^b;
        b=b^a;
        a=a^b;

        System.out.println("a = "+a +" b = "+b);


    }
}
