package parkingLotProblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingAreaTest {

    @Test
    public void should_able_to_park_a_car() {
        ParkingArea parkingArea = new ParkingArea(10);
        parkingArea.park(new Car());
        assertEquals(1,parkingArea.noOfCars());
    }

    @Test
    public void should_return_true_if_the_parking_area_is_full() {
        ParkingArea parkingArea = new ParkingArea(1);
        parkingArea.park(new Car());
        assertTrue(parkingArea.isFull());
    }
}