package practice_3.ex4;

public class MovableCircle extends MovablePoint implements Movable {
    int  radius;
    MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius=radius;
        this.center= new MovablePoint(x,y, xSpeed,ySpeed);
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    public String toString() {
        return center.toString();
    }
}