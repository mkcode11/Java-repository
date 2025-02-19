class Product{

    private String[] pnum_name=new String[2];
    private double price;
    private double qty;

    public Product(String num,String ...n){
        pnum_name[0]=num;
        pnum_name[1]=n[0];
        if(n.length==2){
            price=Double.parseDouble(n[1]);
            qty=0;
        }
        else if(n.length==3){
            price=Double.parseDouble(n[1]);
            qty=Double.parseDouble(n[2]);
        }
        else{
            price=0;
            qty=0;
        }
    }
    public String getItemNo(){
        return pnum_name[0];
    }
    public String getName(){
        return pnum_name[1];
    }
    public double getPrice(){
        return price;
    }
    public double getQty(){
        return qty;
    }
    public void setPrice(double p){
        price=p;
    }
    public void setQty(double q){
        price=q;
    }
}

class Customer{
    private String[] details=new String[4];

    public Customer(String ...A){
        if(A.length==4){
            details[0]=A[0];
            details[1]=A[1];
            details[2]=A[2];
            details[3]=A[3];
        }
        else if(A.length==2){
            details[0]=A[0];
            details[1]=A[1];
            details[2]="0";
            details[3]="0";
        }

    }
    public String getCusId(){
        return details[0];
    }
    public String getCusName(){
        return details[1];
    }
    public String getAddress(){
        return details[2];
    }
    public String getPhone(){
        return details[3];
    }
    public void setAddress(String add){
        details[2]=add;
    }
    public void setPhone(String ph){
        details[3]=ph;
    }
}
public class v117_StudentChallenge_2_Product_N_Customer {
    public static void main(String ...args){

        Product p=new Product("123","maggie","15.5","2");
        Customer c=new Customer("69","Suresh","Mumbai","911");

        System.out.println(p.getItemNo());
        System.out.println(p.getName());
        System.out.println(p.getPrice());
        System.out.println(p.getQty());

        System.out.println(c.getCusId());
        System.out.println(c.getCusName());
        System.out.println(c.getAddress());
        System.out.println(c.getPhone());

    }
}
