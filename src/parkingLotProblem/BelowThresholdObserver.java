package parkingLotProblem;

public class BelowThresholdObserver extends DecoratedObserver{
    private final double threshold;

    public BelowThresholdObserver(Observer observer, double threshold) {
        super(observer);
        this.threshold = threshold;
    }

    @Override
    public void notifyObserver(int noOfCars, int capacity) {
        if(noOfCars/capacity<=threshold)
            super.notifyObserver(noOfCars, capacity);
    }
}
