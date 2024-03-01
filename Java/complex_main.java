import java.util.*;
class complex 
{
    int x,y;
    Scanner sc=new Scanner(System.in);
    void input(int n)    
    {
        System.out.print("\nEnter real part of the number "+n+": ");
        x=sc.nextInt();
        System.out.print("Enter imaginary part of the number "+n+": ");
        y=sc.nextInt();
    }
    void add(complex b)
    {
        complex c=new complex();
        c.x=x+b.x;
        c.y=y+b.y;
        System.out.println("\n("+x+" +i"+y+") + ("+b.x+" +i"+b.y+") = "+c.x+" +i"+c.y);
    }
}
class complex_main
{
    public static void main(String[] args)
    {
        complex a=new complex();
        complex b=new complex();
        a.input(1);
        b.input(2);
        a.add(b);
    }
}