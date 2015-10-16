package visitor.figure;

public class Triangle implements Figure {
    
    public static final double NUMBER_SIDES = 3;
    
    double height;
    
    double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTriangle(this);
    }
    
    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

}
