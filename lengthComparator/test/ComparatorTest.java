import org.junit.Test;

import static org.junit.Assert.*;

public class ComparatorTest {

    @Test
    public void should_compare_two_volumes() {
        Comparator comparator = new Comparator();
        Volume volume1 = new Litre(3.78);
        Volume volume2 = new Gallon(1, new Comparator());
        assertTrue(comparator.areEqual(volume1, volume2));
    }

    @Test
    public void should_compare_two_Lengths() {
        MyLength length1 = new Feet(1,new Comparator());
        MyLength length2 = new Feet(1,new Comparator());
        assertEquals(length1,length2);
    }



}