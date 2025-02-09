public class v84_StudentChallenge_1_ArrayRotation {
    public static void main(String[]args){

        int[] Array={1,2,3,4,5,6,7,8,9};
        int temp=Array[0];

        for(int i=1;i<Array.length-1;++i){
            Array[i-1]=Array[i];
        }
        Array[Array.length-1]=temp;
        for(int x:Array) {
            System.out.print(x+", ");
        }
    }
}
