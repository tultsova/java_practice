package practice_3.ex5;

public class TestMovable {
    public static void main(String[] args) {
        MovableRectangle r1 = new MovableRectangle(6, -1,5, 8, 2, 7 , 5, 8 );
        System.out.println(r1);
        r1.moveUp();
        System.out.println(r1);
        r1.moveLeft();
        System.out.println(r1);
        r1.moveDown();
        System.out.println(r1);
        r1.moveRight();
        System.out.println(r1);
    }
}
