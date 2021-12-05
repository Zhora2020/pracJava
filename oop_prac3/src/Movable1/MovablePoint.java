package Movable1;

public class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

    }
    @Override
    public void moveUp() {
        x = x + xSpeed;
    }

    @Override
    public void moveDown() {
        x = x - xSpeed;
    }

    @Override
    public void moveLeft() {
        y = y - ySpeed;
    }

    @Override
    public void moveRight() {
        y = y + ySpeed;
    }

    public String toString(){
        return "MP: x = " + x + ", y = " + y + ", xSpeed = " + xSpeed + ", ySpeed = " + ySpeed + "\n";
    }
}
