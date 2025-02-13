public class v94_StudentChallenge_3_Max {
    static int max(int[] A){
        int num=A[0];

        for(int x:A){
            if(x>num){
                num=x;
            }
        }
        return num;
    }
    public static void main(String[] args){

        int[] A={9,8,7,6,5,4,3,22,1};

        System.out.println(max(A)+" is Max.");
    }
}
