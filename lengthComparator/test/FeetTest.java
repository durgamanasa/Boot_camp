import org.junit.Test;

import static org.junit.Assert.*;

public class FeetTest {
    @Test
    public void feet_can_be_compared_with_inches() {
        Feet feet = new Feet(1,new Comparator());
        Inch inch = new Inch(12,new Comparator());
        assertEquals(inch,feet);
    }
}