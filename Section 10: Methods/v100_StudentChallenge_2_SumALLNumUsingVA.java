public class v100_StudentChallenge_2_SumALLNumUsingVA {

    static int sumOfAll(int...A){

        int sum=0;
        for(int x:A){
            sum+=x;
        }
        return sum;
    }
    public static void main(String ...args){

        System.out.println("Sum is "+sumOfAll());
        System.out.println("Sum is "+sumOfAll(1,2,3,4,5,6,7,8,9));

    }
}
