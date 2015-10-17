package factoryMethod.naturalNumber.test;

import org.junit.Before;
import org.junit.Test;

import factoryMethod.naturalNumber.Creator;
import factoryMethod.naturalNumber.CreatorNumberEn;
import factoryMethod.naturalNumber.CreatorNumberEs;
import factoryMethod.naturalNumber.CreatorNumberFr;
import factoryMethod.naturalNumber.NaturalNumber;

import static org.junit.Assert.assertEquals;

public class FactoryTest {

    private Creator[] creadores = {new CreatorNumberEs(), new CreatorNumberEn(), new CreatorNumberFr()};

    private NaturalNumber[] numbers = {null, null, null, null};

    @Before
    public void initial() {
        numbers[0] = creadores[0].createNumber(0);
        numbers[1] = creadores[1].createNumber(1);
        numbers[2] = creadores[2].createNumber(2);
        numbers[3] = creadores[0].createNumber(100);
    }

    @Test
    public void test() {
        assertEquals("cero", numbers[0].getTextValue());
        assertEquals("one", numbers[1].getTextValue());
        assertEquals("deux", numbers[2].getTextValue());
        assertEquals("???", numbers[3].getTextValue());
    }

}
