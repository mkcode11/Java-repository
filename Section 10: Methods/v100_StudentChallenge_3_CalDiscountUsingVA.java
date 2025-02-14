public class v100_StudentChallenge_3_CalDiscountUsingVA {

    static int sumOfAll(double ...A){
        int sum=0;
        for(double x:A){
            sum+=x;
        }
        return sum;
    }
    static double disCount(double ...A){
        double discount=0;
        int sum=sumOfAll(A);

        if(sum<=500){ //10%
            discount = (10/100.0)*sum;
        }
        else if(sum<1000){ //15%
            discount=(15/100.0)*sum;
        }
        else if(sum>1000){ //20%
            discount=(20/100.0)*sum;
        }

        return discount;
    }
    public static void main(String...args){

        System.out.println("Your discount is $"+disCount(100,200,250,50,60));
    }
}
