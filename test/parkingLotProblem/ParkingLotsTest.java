package parkingLotProblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingLotsTest {
    @Test
    public void should_hold_multiple_parking_lots() {
        ParkingLots parkingLots = new ParkingLots();
        parkingLots.add(new ParkingLot(2));
        assertEquals(1, parkingLots.noOfParkingLots());
    }
}