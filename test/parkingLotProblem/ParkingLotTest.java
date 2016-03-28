package parkingLotProblem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ParkingLotTest {

    @Test
    public void should_able_to_park_a_car() {
        ParkingLot parkingArea = new ParkingLot(1);
        parkingArea.parkCar(new Object());
        assertEquals(1, parkingArea.noOfCars());
    }

    @Test
    public void should_return_true_if_the_parking_area_is_full() {
        ParkingLot parkingArea = new ParkingLot(1);
        parkingArea.parkCar(new Object());
        assertTrue(parkingArea.isFull());
    }

    @Test
    public void should_update_status_of_the_parking_lot_to_observers() {
        ParkingLot parkingArea = new ParkingLot(1);
        parkingArea.parkCar(new Object());
        assertTrue(parkingArea.isFull());
    }

    @Test
    public void manager_should_notify_when_parking_lot_is_eighty_percent_full() {
        Observer manager = new Observer() {
            @Override
            public void notify(int noOfCar) {
                assertEquals(noOfCar,2);
            }
        };
        ParkingLot parkingLot = new ParkingLot(2);

        parkingLot.addObserver(new AboveThresholdObserver(manager,.8));
        assertTrue(parkingLot.parkCar(new Object()));
        assertTrue(parkingLot.parkCar(new Object()));
    }

    @Test
    public void attendant_should_notify_when_parking_below_20_percent_full() {
        Observer attendant = new Observer() {
            @Override
            public void notify(int noOfCar) {
                assertEquals(1,noOfCar);
            }
        };
        ParkingLot parkingLot = new ParkingLot(10);

        parkingLot.addObserver(new BelowThresholdObserver(attendant,.2));
        assertTrue(parkingLot.parkCar(new Object()));
    }
}