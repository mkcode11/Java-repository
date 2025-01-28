public class IsBinaryNHexStudentChallenge2 {
    public static void main(String[] args){

        int b=101101;
        String h="1f4";
        String date="12/09/1998";


        String binary=String.valueOf(b);
        String hexDecimal=String.valueOf(h);

        System.out.println(binary +" Is Binary : "+binary.matches("[01]+"));
        System.out.println(hexDecimal +" Is HexDecimal : "+hexDecimal.matches("[0-9A-f]+"));
        System.out.println(date +" Is Date Format Valid(dd/mm/yyyy) : "+ date.matches("([0-3][0-9])/([0-1][0-9])/([0-9]{4})"));
    }
}
