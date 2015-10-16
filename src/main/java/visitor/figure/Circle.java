package visitor.figure;

public class Circle implements Figure {
    
    public static final double NUMBER_SIDES = Double.POSITIVE_INFINITY;

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCircle(this);
    }

    public double getRadius() {
        return radius;
    }

}
