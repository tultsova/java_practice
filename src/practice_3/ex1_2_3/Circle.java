package practice_3.ex1_2_3;

public class Circle extends Shape{
    protected double radius;

    public Circle(double radius) {
        this.radius=radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }

    public double getRadius() {
        System.out.println("Radius of circle");
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        System.out.println("Area of circle");
        return 3.14*radius*radius;
    }

    public double getPerimiter() {
        System.out.println("Perimiter of circle");
        return 2*3.14*radius;
    }

    public String toString() {
        System.out.println("Circle has radius, color, filled");
        return radius + " " + color + " " + filled;
    }

}
