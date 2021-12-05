package Shape1;

public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(double side){
        super(side, side);
    }

    public Square(String colour, boolean filled, double side){
        super(side, side, colour, filled);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side){
        width = side;
        length = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square: " + "width= " + width + ", length= " + length + ", colour= " + color  + ", filled= " + filled + "\n";
    }
}
