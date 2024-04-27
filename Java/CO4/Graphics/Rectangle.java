package Graphics;



public class Rectangle implements Figure 
{
    double length;
    double breadth;
    public Rectangle(double l,double b)
    {
        length=l;
        breadth=b;
    }
    public void area()
    {
        System.out.println("Area of Rectangle: " + String.format("%.2f",(length*breadth)));
    }    
}
