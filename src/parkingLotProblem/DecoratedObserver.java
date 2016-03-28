package parkingLotProblem;

public class DecoratedObserver  {
    private Observer observer;

    public DecoratedObserver(Observer observer) {
        this.observer = observer;
    }

    public void notifyObserver(int noOfCars, int capacity){
        observer.notify(noOfCars);
    }
}
