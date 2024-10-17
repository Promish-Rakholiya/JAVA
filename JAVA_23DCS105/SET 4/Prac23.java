interface Shape 
{
    String getColor();
}
class Circle implements Shape {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

}


class Rectangle implements Shape {
    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

}

class Sign {
    private Shape shape;
    private String text;

    public Sign(Shape shape, String text) {
        this.shape = shape;
        this.text = text;
    }

    public void display() {
        System.out.println("Sign Details:");
        System.out.println("Shape: " + shape.getClass().getSimpleName());
        System.out.println("Color: " + shape.getColor());
        System.out.println("Text: " + text);
    }
}

public class Prac23{
    public static void main(String[] args) {
        Shape circle = new Circle(5, "Red");
        Shape rectangle = new Rectangle(4, 6, "Blue");

        Sign circleSign = new Sign(circle, "Welcome to the Campus");
        Sign rectangleSign = new Sign(rectangle, "Library Entrance");

        circleSign.display();
        System.out.println();
        rectangleSign.display();
    }
}
