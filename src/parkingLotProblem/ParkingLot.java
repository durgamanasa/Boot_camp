/*
Job: Park the given car in parking area and all the behaviour related to parking area
 */
package parkingLotProblem;

import java.util.ArrayList;

public class ParkingLot {
    private final ArrayList<Object> parkedCars = new ArrayList<>();
    private int limitOfCars;
    private final ArrayList<DecoratedObserver> observers = new ArrayList<>();

    public ParkingLot(int limitOfCars) {
        this.limitOfCars = limitOfCars;
    }

    public void addObserver(DecoratedObserver observer) {
        observers.add(observer);
    }

    public boolean parkCar(Object car) {
        if (!isFull()){
            parkedCars.add(car);
            notifyAllObservers();
            return true;
        }
        return false;
    }

    private void notifyAllObservers() {
        for (DecoratedObserver observer : observers) {
            observer.notifyObserver(noOfCars(),limitOfCars);
        }
    }

    public boolean isFull() {
        return parkedCars.size() == limitOfCars;
    }

    public int noOfCars() {
        return parkedCars.size();
    }
    public int capacityOfParkingLot(){
        return limitOfCars;
    }
}
