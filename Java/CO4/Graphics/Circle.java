package Graphics;

interface Figure 
{
    public void area();
}

public class Circle implements Figure 
{
    double radius;
    public Circle(double r)
    {
        radius = r;
    }
    public void area()
    {
        System.out.println("Area of circle: " + String.format("%.2f",(3.14*radius*radius)));
    }
    
}
