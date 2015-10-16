package visitor.figure;

public class NumberSides implements Visitor {
    
    double totalSides = 0;

    @Override
    public void visitCircle(Circle circle) {
        totalSides += Circle.NUMBER_SIDES;
    }

    @Override
    public void visitSquare(Square square) {
        totalSides += Square.NUMBER_SIDES;
    }

    @Override
    public void visitTriangle(Triangle triangle) {
        totalSides += Triangle.NUMBER_SIDES;
    }

}
