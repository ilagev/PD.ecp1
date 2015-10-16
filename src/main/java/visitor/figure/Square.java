package visitor.figure;

public class Square implements Figure {
    
    public static final double NUMBER_SIDES = 4;
    
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSquare(this);
    }

    public double getSide() {
        return side;
    }
    
}
