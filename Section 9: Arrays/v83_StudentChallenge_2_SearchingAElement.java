public class v83_StudentChallenge_2_SearchingAElement {
    public static void main(String[]args){

        int[] A={1,2,3,4,5,6,7,8,9};
        int key=8;

        for(int i=0;i<A.length;++i){
            if(key==A[i]){
                System.out.println(key+" is found at Index "+i);
                System.exit(0);
            }
        }
        System.out.println("Not Found");
    }
}
