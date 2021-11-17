package practice_3.ex5;

import practice_3.ex4.Movable;
import practice_3.ex4.MovablePoint;

public class MovableRectangle extends MovablePoint implements Movable {
    MovablePoint topLeft;
    MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int xSpeed1, int ySpeed1, int x2, int y2, int xSpeed2, int ySpeed2) {
        if (xSpeed1!=xSpeed2 && ySpeed2!=ySpeed1) {
            xSpeed2=xSpeed1;
            ySpeed2=ySpeed1;
        }
        this.topLeft= new MovablePoint(x1,y1,xSpeed1,ySpeed1);
        this.bottomRight= new MovablePoint(x2,y2,xSpeed2,ySpeed2);
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public String toString() {
        return "TopLeft = " + topLeft.toString() + " BottomRight = " + bottomRight.toString();
    }
}