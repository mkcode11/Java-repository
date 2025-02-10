public class v85_StudentChallenge_3_IncreasingSizeOfArray {
    public static void main(String[]args){

        int[] Array={1,2,3,4,5};
         System.out.println("Before : "+Array.length);
         
         int[] ArrayB=new int[2*Array.length];
         
         for(int i=0;i<Array.length;++i){
             ArrayB[i]=Array[i];
         }
         Array=ArrayB;
         ArrayB=null;

         System.out.println("After : "+Array.length);
    }
}
