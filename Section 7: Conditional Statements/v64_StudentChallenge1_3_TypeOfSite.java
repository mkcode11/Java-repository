import java.util.*;
public class v64_StudentChallenge1_3_TypeOfSite {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Site : ");
        String site=sc.next();


        site=site.substring(site.lastIndexOf(".")+1);

        switch(site){
            case "com" : System.out.println("Commercial"); break;
            case "org" : System.out.println("Organisation"); break;
            case "net" : System.out.println("Network"); break;
            case "gov" : System.out.println("Government"); break;
            default: System.out.println("Don't Know."); break;
        }
    }
}
