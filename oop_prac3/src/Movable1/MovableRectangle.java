package Movable1;

public class MovableRectangle implements Movable {

    private MovablePoint topLeft, bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        bottomRight = new MovablePoint(x1, y1, xSpeed, ySpeed);
        topLeft = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public boolean speedCheck(){
        return bottomRight.xSpeed == topLeft.xSpeed && bottomRight.ySpeed == topLeft.ySpeed;
    }

    @Override
    public void moveUp() {
        if(speedCheck()){
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }

    @Override
    public void moveDown() {
        if(speedCheck()){
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    @Override
    public void moveLeft() {
        if(speedCheck()){
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }

    @Override
    public void moveRight() {
        if(speedCheck()){
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }
    public String toString(){
        return "MovableRectangle:\nMPR{ x = " + bottomRight.x + ",  y = " + bottomRight.y + " }\n" + "MPL{ x = " + topLeft.x + ", y = " + topLeft.y + " }\n";
    }
}
