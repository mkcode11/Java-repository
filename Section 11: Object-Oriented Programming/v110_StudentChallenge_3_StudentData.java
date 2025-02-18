import java.util.Scanner;
class Student{
    Scanner sc=new Scanner(System.in);

    private String[] details=new String[3];
    private double[] marks=new double[3];

    public Student(){
        enter_details();
    }
    public void enter_marks(){
        for(int i=0;i<marks.length;++i){
            System.out.print("Enter M"+(i+1)+" : ");
            marks[i]=sc.nextDouble();
        }
    }
    private void enter_details(){
        int i=1;
        System.out.print((i++)+". Enter RollNum : "); details[0]=sc.next();
        System.out.print((i++)+". Enter Name : ");details[1]=sc.next();
        System.out.print((i++)+". Enter Course : ");details[2]=sc.next();
        System.out.println((i++)+". Enter Marks : ");enter_marks();

    }
    public void student_details(){
        System.out.println("RollNum : "+details[0]);
        System.out.println("Name : "+details[1]);
        System.out.println("Course : "+details[2]);
        System.out.println("Total : "+total()+"/300.0");
        System.out.println("Average : "+avg());
        System.out.println("Grade : "+grade());
    }
    public double avg(){

        return total()/marks.length;
    }
    public char grade(){
        return (avg()>=60) ? ('A'):('B');
    }

    public double total(){
        double sum=0;
        for(double x:marks){
            sum+=x;
        }
        return sum;
    }


}
public class v110_StudentChallenge_3_StudentData {
    public static void main(String ...args){

        Student s1=new Student();


        s1.student_details();
    }
}
