import java.util.*;
class complex {
    int x,y;
    Scanner sc=new Scanner(System.in);
    void input()    
    {
        System.out.print("Enter real part of the number: ");
        x=sc.nextInt();
        System.out.print("Enter imaginary part of the number: ");
        y=sc.nextInt();
    }
    void add(complex b)
    {
        x+=b.x;
        y+=b.y;
        System.out.println("Sum = "+x+" +i"+y);
    }
    public static void main(String[] args) {
        complex a=new complex();
        complex b=new complex();
        a.input();
        b.input();
        a.add(b);
    }
}
