public class IsStringWebsite {
    public static void main(String[] args){

        String str="www.abcd.org";

        System.out.println(str);

        System.out.println(str.startsWith("www."));
        System.out.println(str.startsWith("www"));
        System.out.println(str.charAt(3));
        int i=str.indexOf(".");
        System.out.println(String.valueOf(i)+1);
        System.out.println(str.lastIndexOf(".",7));

    }
}
