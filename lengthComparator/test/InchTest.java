import org.junit.Test;

import static org.junit.Assert.*;

public class InchTest {
    @Test
    public void inch_can_be_compared_with_cm() {
        Inch lengthInInch = new Inch(2,new Comparator());
        CentiMeter lengthInCentiMeter = new CentiMeter(5,new Comparator());
        assertEquals(lengthInInch,lengthInCentiMeter);
    }

    @Test
    public void should_return_addition_of_two_inches() {
        Inch length1 = new Inch(2,new Comparator());
        Inch length2 = new Inch(3,new Comparator());
        Inch expectedSum = new Inch(5,new Comparator());
        assertEquals(expectedSum,length1.add(length2));
    }
}