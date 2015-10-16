package visitor.figure;

public class Area implements Visitor {
    
    double totalArea = 0;

    @Override
    public void visitCircle(Circle circle) {
        totalArea += Math.PI * circle.getRadius() * circle.getRadius();
    }

    @Override
    public void visitSquare(Square square) {
        totalArea += square.getSide() * square.getSide(); 
    }

    @Override
    public void visitTriangle(Triangle triangle) {
        totalArea += triangle.getBase() * triangle.getHeight() / 2;
    }
    
    public double getTotalArea() {
        return totalArea;
    }

}
