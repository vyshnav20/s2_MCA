import java.util.Scanner;

import Graphics.*;
class CO4_1 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter radius of circle: ");
        double cr=sc.nextDouble();
        Graphics.Circle c = new Graphics.Circle(cr);   
        c.area();
        System.out.print("\nEnter length and breadth of rectangle: ");
        double l=sc.nextDouble();
        double b=sc.nextDouble();
        Graphics.Rectangle r = new Graphics.Rectangle(l,b);
        r.area();
        System.out.print("\nEnter side of square: ");
        l=sc.nextDouble();
        Graphics.Square s = new Graphics.Square(l);
        s.area();
        System.out.print("\nEnter height and breadth of triangle: ");
        l=sc.nextDouble();
        b=sc.nextDouble();
        Graphics.Triangle t = new Graphics.Triangle(b,l);
        t.area();
    }
}
