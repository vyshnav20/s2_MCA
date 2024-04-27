package Graphics;


public class Square implements Figure 
{
    double length;
    public Square(double l)
    {
        length=l;
    }
    public void area()
    {
        System.out.println("Area of Square: " + String.format("%.2f",(length*length)));
    }
}
