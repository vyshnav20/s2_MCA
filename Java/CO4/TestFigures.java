// Import the Graphics package
import Graphics.*;

public class TestFigures {
    public static void main(String[] args) {
        // Create instances of figures from the Graphics package
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        Triangle triangle = new Triangle(5.0, 10.0);
        Square square = new Square(5.0);
        Circle circle = new Circle(5.0);

        // Display the area of each figure
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Triangle: " + triangle.area());
        System.out.println("Area of Square: " + square.area());
        System.out.println("Area of Circle: " + circle.area());
    }
}
