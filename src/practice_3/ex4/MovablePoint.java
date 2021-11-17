package practice_3.ex4;

public class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x=x;
        this.y=y;
        if (xSpeed < 0) xSpeed*=-1;
        if (ySpeed < 0) ySpeed*=-1;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public MovablePoint() {}

    @Override
    public void moveUp() {
        y+=ySpeed;
    }

    @Override
    public void moveDown() {
        y-=ySpeed;
    }

    @Override
    public void moveLeft() {
        x-=xSpeed;
    }

    @Override
    public void moveRight() {
        x+=xSpeed;
    }

    public String toString() {
        return "x = "+ x + " y = "+y;
    }
}