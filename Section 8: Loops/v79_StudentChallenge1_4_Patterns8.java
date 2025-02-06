public class v79_StudentChallenge1_4_Patterns8 {
    public static void main(String[]args){


        for(int row=1;row<=5;++row){
            for(int column=1;column<=5;++column){

                if(column>=row){
                    System.out.print(" *");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
