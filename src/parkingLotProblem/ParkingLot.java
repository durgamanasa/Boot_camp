/*
Job: Park the given car in parking area and all the behaviour related to parking area
 */
package parkingLotProblem;

import java.util.ArrayList;

public class ParkingLot {
    private final ArrayList<Car> parkedCars = new ArrayList<>();
    private int limitOfCars;

    public ParkingLot(int limitOfCars) {
        this.limitOfCars = limitOfCars;
    }

    public void park(Car car) {
        parkedCars.add(car);
    }

    public int noOfCars() {
        return parkedCars.size();
    }

    public boolean isFull() {
        return parkedCars.size() == limitOfCars;
    }
}
