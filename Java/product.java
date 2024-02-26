import java.util.Scanner;
class product
{
    String pcode,pname;
    int price;
    void details()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter product code: ");
        pcode=sc.next();
        System.out.println("Enter product name: ");
        pname=sc.next();
        System.out.println("Enter product price: ");
        price=sc.nextInt();
    }
    void greatest(product a,product b)
    {
        if(price>a.price && price>b.price)
            System.out.println("Object 1 has greatest price");
        else if(a.price>b.price)
            System.out.println("Object 2 has greatest price");
        else 
            System.out.println("Object 3 has greatest price");
    }
    public static void main(String[] args) {
        product p1=new product();
        product p2=new product();
        product p3=new product();
        p1.details();
        p2.details();
        p3.details();
        p1.greatest(p2, p3);
    }
}