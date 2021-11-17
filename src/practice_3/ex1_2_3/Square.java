package practice_3.ex1_2_3;

public class Square extends Rectangle{

    public Square() {}

    public Square(double side) {
        this.length=side;
        this.width=side;
    }

    public double getSide() {
        System.out.println("Side of square");
        return width;
    }

    public void setSide(double side) {
        this.width=side;
        this.length=side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
