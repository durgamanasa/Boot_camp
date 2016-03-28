package parkingLotProblem;

public class AboveThresholdObserver extends DecoratedObserver {
    private final double threshold;

    public AboveThresholdObserver(Observer observer, double threshold) {
        super(observer);
        this.threshold = threshold;
    }

    @Override
    public void notifyObserver(int noOfCars, int capacity) {
        if(noOfCars/capacity > threshold) {
            super.notifyObserver(noOfCars, capacity);
        }
    }
}
