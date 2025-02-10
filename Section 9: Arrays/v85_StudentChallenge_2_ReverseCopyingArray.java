public class v85_StudentChallenge_2_ReverseCopyingArray {
    public static void main(String[]args){

        int[] Array=new int[10];

        Array[0]=1;
        Array[1]=21;
        Array[2]=37;
        Array[3]=49;
        Array[4]=55;
        Array[5]=62;
        Array[6]=88;
        Array[7]=77;
        Array[8]=27;
        Array[9]=11;

        for(int x:Array){
            System.out.print(x+", ");
        }
        System.out.println("");

        int len=Array.length;
        int[] ArrayB=new int[len];

        for(int i=len-1,j=0;i>=0;--i,++j){
            ArrayB[j]=Array[i];
        }
        for(int x:ArrayB){
            System.out.print(x+", ");
        }
    }
}
