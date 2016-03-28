package parkingLotProblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingLotsTest {
    @Test
    public void should_hold_multiple_parking_lot() {
        ParkingLots parkingLots = new ParkingLots(2);
        parkingLots.addParkingLot(new ParkingLot(2));
        assertEquals(1, parkingLots.noOfParkingLots());
    }

    @Test
    public void should_able_to_add_a_car_to_particular_parking_lot() {
        ParkingLots parkingLots = new ParkingLots(1);
        parkingLots.addParkingLot(new ParkingLot(2));
        assertTrue(parkingLots.parkCarIn(0, new Object()));
    }
    @Test
    public void civic_body_should_notify_when_parking_lots_are_80_percent_full() {
        Observer civicBody = new Observer() {
            @Override
            public void notify(int noOfCar) {
                assertEquals(2,noOfCar);
            }
        };
        ParkingLots parkingLots = new ParkingLots(2);
        ParkingLot parkingLot = new ParkingLot(2);
        parkingLots.addParkingLot(new ParkingLot(10));
        parkingLots.addParkingLot(parkingLot);

        parkingLots.addObserver(new AboveThresholdObserver(civicBody,.8));
        assertTrue(parkingLots.parkCarIn(0,new Object()));
        assertTrue(parkingLots.parkCarIn(0,new Object()));
    }
}