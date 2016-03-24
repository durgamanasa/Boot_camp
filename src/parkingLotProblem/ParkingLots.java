package parkingLotProblem;

import java.util.ArrayList;

public class ParkingLots {
    private final ArrayList<ParkingLot> parkingLots = new ArrayList<>();

    public void add(ParkingLot parkingLot) {
        parkingLots.add(parkingLot);
    }

    public int noOfParkingLots() {
        return parkingLots.size();
    }
}
