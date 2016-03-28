/*
Job: Holds multiple ParkingLot
 */

package parkingLotProblem;

import java.util.ArrayList;
import java.util.Iterator;

public class ParkingLots  {
    private final ArrayList<ParkingLot> parkingLots = new ArrayList<>();
    private ArrayList<DecoratedObserver> observers = new ArrayList<>();
    private int limitOfParkingLots;

    public ParkingLots(int limitOfParkingLots) {
        this.limitOfParkingLots = limitOfParkingLots;
    }

    public void addParkingLot(ParkingLot parkingLot) {
        if (!isFull()) {
            parkingLots.add(parkingLot);
        }
    }

    private void notifyAllObservers() {
        for (DecoratedObserver observer : observers) {
            observer.notifyObserver(noOfCarsInParkingLots(parkingLots),capacityOfParkingLots(parkingLots));
        }
    }

    private boolean isFull() {
        return limitOfParkingLots <= parkingLots.size();
    }

    private int noOfCarsInParkingLots(ArrayList<ParkingLot> parkingLots){
        int total = 0;
        for (ParkingLot parkingLot : parkingLots) {
            total+=parkingLot.noOfCars();
        }
        return total;
    }
    private int capacityOfParkingLots(ArrayList<ParkingLot> parkingLots){
        int totalCapacity =0;
        for (ParkingLot parkingLot : parkingLots) {
            totalCapacity+=parkingLot.capacityOfParkingLot();
        }
        return totalCapacity;
    }


    public int noOfParkingLots() {
        return parkingLots.size();
    }

    public void addObserver(DecoratedObserver notifier) {
        observers.add(notifier);
    }

    public boolean parkCarIn(int parkingLotIndex, Object car) {
        if (parkingLotIndex > parkingLots.size())
            return false;
        ParkingLot parkingLotToAddCar = getParkingLot(parkingLotIndex);
        parkingLotToAddCar.parkCar(car);
        notifyAllObservers();
        return true;
    }

    private ParkingLot getParkingLot(int parkingLotIndex) {
        return parkingLots.get(parkingLotIndex);
    }


}
