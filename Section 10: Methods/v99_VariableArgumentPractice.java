public class v99_VariableArgumentPractice {

    static void showList(int start,String ...S){
        for(String s : S ){
            System.out.println(start+". "+s);
            ++start;
        }
    }
    public static void main(String ...args){
        showList(5,"John","Mark","Smith","Suresh");
    }
}
