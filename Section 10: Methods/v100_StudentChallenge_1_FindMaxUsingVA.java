public class v100_StudentChallenge_1_FindMaxUsingVA {

    static int max(int ...A){

        if(A.length==0) return Integer.MIN_VALUE;

        int m=A[0];
        for(int i=1;i<A.length;++i){
            if(A[i]>m){
                m=A[i];
            }
        }
        return m;
    }
    public static void main(String ...args){
        System.out.println("Max is "+max());
        System.out.println("Max is "+max(10,99,44,222));

    }
}
