import org.junit.Test;

import static org.junit.Assert.*;

public class GallonTest {

    @Test
    public void gallon_can_be_compared_with_liter() {
        Gallon volumeInGallon = new Gallon(1,new Comparator());
        Litre volumeInLiter = new Litre(3.78);
        assertEquals(volumeInGallon,volumeInLiter);
    }
}