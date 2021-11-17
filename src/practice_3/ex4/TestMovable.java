package practice_3.ex4;

public class TestMovable {
    public static void main(String[] args) {
        MovableCircle c1 = new MovableCircle(6, -1,5, 8, 2);
        System.out.println(c1);
        c1.moveUp();
        System.out.println(c1);
        c1.moveLeft();
        System.out.println(c1);
        c1.moveDown();
        System.out.println(c1);
        c1.moveRight();
        System.out.println(c1);
    }
}