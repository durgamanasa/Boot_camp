package parkingLotProblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingLotTest {

    @Test
    public void should_able_to_park_a_car() {
        ParkingLot parkingArea = new ParkingLot(10);
        parkingArea.park(new Car());
        assertEquals(1,parkingArea.noOfCars());
    }

    @Test
    public void should_return_true_if_the_parking_area_is_full() {
        ParkingLot parkingArea = new ParkingLot(1);
        parkingArea.park(new Car());
        assertTrue(parkingArea.isFull());
    }
}