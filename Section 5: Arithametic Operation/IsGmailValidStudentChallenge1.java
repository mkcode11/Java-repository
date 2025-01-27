import java.util.*;
public class IsGmailValidStudentChallenge1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

//        System.out.print("Enter Mail : ");
//        String mail=sc.next();
        String mail="mohit@hotgmail.com";
        System.out.println(mail);

        int indexofA=mail.indexOf("@");

        String username=mail.substring(0,indexofA);
        String domain=mail.substring(indexofA+1);

        System.out.println("Username : "+username);
        System.out.println("Domain : "+domain);

        System.out.println("Mail is on Gmail : "+ domain.startsWith("gmail"));

    }
}
