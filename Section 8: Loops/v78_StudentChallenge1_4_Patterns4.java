public class v78_StudentChallenge1_4_Patterns4 {
    public static void main(String[]args){

        int count=1;
        for(int row=1;row<=5;++row){
            for(int column=1;column<=5;++column){
                System.out.format("%02d, ",count);
                ++count;
            }
            System.out.println();
        }
    }
}
