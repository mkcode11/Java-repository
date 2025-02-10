public class v85_StudentChallenge_1_CopyingArray {
    public static void main(String[]args){

        int[] Array=new int[10];

        Array[0]=1;
        Array[1]=21;
        Array[2]=37;
        Array[3]=49;
        Array[4]=55;
        Array[5]=62;

        int[] ArrayB=new int[Array.length];

        for(int i=0;i<Array.length-1;++i){
            ArrayB[i]=Array[i];
        }
        for(int x:ArrayB){
            System.out.print(x+", ");
        }
    }
}
