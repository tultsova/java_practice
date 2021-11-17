package practice_3.ex1_2_3;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {}

    public Shape(String color, boolean filled) {
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        System.out.println("Color is");
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        System.out.println("Filled is");
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract String toString();

    public abstract double getArea();

    public abstract double getPerimiter();
}
