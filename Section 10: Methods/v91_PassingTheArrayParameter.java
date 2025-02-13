public class v91_PassingTheArrayParameter {

    void change(int[] x,int i,int num){
        x[i]=num;
        System.out.println(x);
    }
    public static void main(String[]args){

        v91_PassingTheArrayParameter object=new v91_PassingTheArrayParameter();

        int[] A={1,2,3,4,5,6};
        int index=3,number=99;


        object.change(A,index,number);

        for(int x:A){
            System.out.print(x+", ");
        }

        System.out.println("\n"+A);

    }
}
