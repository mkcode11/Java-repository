public class v79_StudentChallenge1_3_Patterns7 {
    public static void main(String[]args){


        for(int row=1;row<=5;++row){
            for(int column=1;column<=(5-row)+1;++column){
                System.out.print(column+", ");
            }
            System.out.println();
        }
    }
}
