package visitor.figure.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import visitor.figure.*;

public class VisitorTest {
    
    private Collection<Figure> figures = new ArrayList<Figure>();
    
    @Before
    public void initial() {
        figures.add(new Circle(2.5));
        figures.add(new Circle(5.2));
        figures.add(new Triangle(5.2, 5.7));
        figures.add(new Triangle(3.3, 9.4));
        figures.add(new Square(3.2));
        figures.add(new Square(7.2));
    }
    
    @Test
    public void testVisitorArea() {
        Area area = new Area();
        for (Figure figure : figures) {
            figure.accept(area);
        }
        assertEquals(196.99356, area.getTotalArea(), 10e-5);
    }
    
    @Test
    public void testVisitorSides() {
        NumberSides sides = new NumberSides();
        for (Figure figure : figures) {
            figure.accept(sides);
        }
        assertEquals(Double.POSITIVE_INFINITY, sides.getTotalSides(), 10e-5);
    }

}
