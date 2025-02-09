public class v83_StudentChallenge_3_FindMax {
    public static void main(String[]args){

        int[] Array={1,2,34,5,4005,6,677};

        int max1,max2;
        max1=max2=0;

        for(int x:Array){
            if(x>max1){
                max2=max1;
                max1=x;
            }
            else if(x>max2){
                max2=x;
            }
        }
        System.out.println(max2+"\n"+max1);

    }
}
