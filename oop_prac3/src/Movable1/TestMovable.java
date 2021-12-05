package Movable1;

public class TestMovable {
    public static void main(String[] args) {
        MovableCircle m1 = new MovableCircle(0,0,4,3, 2);
        System.out.println(m1);
        m1.moveDown();
        m1.moveLeft();
        System.out.println(m1);

        MovableRectangle r1 = new MovableRectangle(0,0,5,3,2,3);
        System.out.println(r1);
        r1.moveRight();
        r1.moveUp();
        System.out.println(r1);
    }
}
