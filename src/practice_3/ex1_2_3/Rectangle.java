package practice_3.ex1_2_3;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle() {}

    public Rectangle(double width, double length) {
        this.width=width;
        this.length=length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width=width;
        this.length=length;
        this.color=color;
        this.filled=filled;
    }

    public double getWidth() {
        System.out.println("Width of rectangle");
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        System.out.println("Length of rectangle");
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        System.out.println("Lines of rectangle");
        return width+" "+length;
    }

    @Override
    public double getArea() {
        System.out.println("Area of rectangle");
        return width*length;
    }

    @Override
    public double getPerimiter() {
        System.out.println("Perimiter of rectangle");
        return 2*(width+length);
    }

}

