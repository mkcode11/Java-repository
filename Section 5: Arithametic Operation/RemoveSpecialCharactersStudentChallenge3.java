public class RemoveSpecialCharactersStudentChallenge3 {
    public static void main(String[]args){

        String str1="a!B@c#1$2%3";
        System.out.println(str1.replaceAll("[^a-zA-z0-9]",""));

        String str2="   abc   def   gh  ijk  ";
        String str3=str2.replaceAll("(\\s)+"," ").trim();
        System.out.println(str3);

        String words[] = str3.split("\\s");
        System.out.println(words.length+" "+ words );


    }
}
