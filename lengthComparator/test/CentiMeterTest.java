import org.junit.Test;

import static org.junit.Assert.*;

public class CentiMeterTest {
    @Test
    public void centi_meter_can_be_compared_with_milli_meter() {
        CentiMeter lengthInCentiMeter = new CentiMeter(1, new Comparator());
        MM lengthInMMeter = new MM(10);
        assertEquals(lengthInCentiMeter, lengthInMMeter);
    }
}