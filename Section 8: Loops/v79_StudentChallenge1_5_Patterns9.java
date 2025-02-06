public class v79_StudentChallenge1_5_Patterns9 {
    public static void main(String[]args){

        //For Upper Triangle
        for(int row=1;row<=5;++row){
            for(int column=1;column<=5;++column){

                if(row+column>5){
                    System.out.print(" *");
                }
                else {
                    System.out.print("  ");
                }

            }
            if(row>1){
                for(int column=1;column<row;++column){
                    System.out.print(" *");
                }
            }
            System.out.println();
        }



       //For Lower Trinangle
        for(int row=1;row<=5;++row){

            for (int column = 1; column <= 5; ++column) {

                if (column>=row+1){
                        System.out.print(" *");
                }
                else{
                        System.out.print("  ");
                }


            }
            for(int column=1;column<=4;++column){

                if(column>row){
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}
