public class v79_StudentChallenge_1_Patterns6 {
    public static void main(String[]args){

        int count=1;
        for(int row=1;row<=5;++row){
            for(int column=1;column<=row;++column){
                System.out.format("%02d, ",count);
                ++count;
            }
            System.out.println();
        }
    }
}
