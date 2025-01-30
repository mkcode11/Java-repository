import java.util.*;
public class v63_StudentChallenge1_2_TypeOfSiteAndProtocolUsed {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Site : ");
        String site=sc.next();

        /*This Find the Protocol*/
        int semicolon=site.indexOf(":");
        String protocol=site.substring(0,semicolon);

        /*This Finds the TypeOfSite*/
        int dot_index=site.lastIndexOf(".");
        String type=site.substring(dot_index+1);

        if(protocol.equals("http")){
            System.out.println("http-> Hyper Text Transfer Protocol");
        }
        else if(protocol.equals("ftp")){
            System.out.println("ftp-> File Transfer Protocol");
        }

        if(type.equals("com")){
            System.out.println("com-> Commercial");
        }
        else if (type.equals("org")){
            System.out.println("org-> Organization");
        }
        else if(type.equals("net")){
            System.out.println("net-> network");
        }
    }
}
