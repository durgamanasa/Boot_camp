package wizard;

public enum Ball {
    GREEN(3);

    private int maxCapacity;

    Ball(int maxCapacity) {

        this.maxCapacity = maxCapacity;
    }

    public boolean isCapable(int currentCount) {
        return currentCount < maxCapacity;
    }
}
