public class v97_StudentChallenge_2_ReverseNumOrArrayUsingOverloading {

    static int reverse(int num){
        int reverse=0;

        while(num!=0){
          reverse=(reverse*10)+(num%10);
          num/=10;
        }
        return reverse;
    }
    static void reverse(int[] A){
        int len=A.length-1;
        for(int i=0;i<=len/2;++i){
            int temp=A[i];
            A[i]=A[len-i];
            A[len-i]=temp;
        }
    }
    public static void main(String[]args){

        int num=234;
        int[] A={1,2,3,4,5,6,7,8,9};

        System.out.println("Number Before : "+num+"\nNumber After : "+reverse(num));

        System.out.println("Array Before : ");
        for(int x:A){
            System.out.print(x+", ");
        }
        System.out.println("");
        reverse(A);
        System.out.println("Array After : ");
        for(int x:A){
            System.out.print(x+", ");
        }


    }

}
