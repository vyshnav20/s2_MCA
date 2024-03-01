import java.util.Scanner;
class product
{
    String pcode,pname;
    int price;
    void details(int n)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter product code for item "+n+": ");
        pcode=sc.next();
        System.out.print("Enter product name for item "+n+": ");
        pname=sc.next();
        System.out.print("Enter product price for item "+n+": ");
        price=sc.nextInt();
    }
    void greatest(product a,product b)
    {
        if(price<a.price && price<b.price)
            System.out.println("\nProduct "+pname+" has lowest price");
        else if(a.price<b.price)
            System.out.println("\nProduct "+a.pname+" has lowest price");
        else 
            System.out.println("\nProduct "+b.pname+" has lowest price");
    }
}
class compare_objects 
{
    public static void main(String[] args) 
    {
        product p1=new product();
        product p2=new product();
        product p3=new product();
        p1.details(1);
        p2.details(2);
        p3.details(3);
        p1.greatest(p2, p3);
    }
}