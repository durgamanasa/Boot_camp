package wizard;

public class Ball {


    private Colours colour;

    public Ball(Colours colour) {
        this.colour = colour;
    }

    public Colours getColour(){
        return colour;
    }

    public boolean isOfSameColour(Colours otherColour) {
        return colour == otherColour;
    }
}


//public enum Ball {
//    GREEN(3);
//
//    private int maxCapacity;
//
//    Ball(int maxCapacity) {
//
//        this.maxCapacity = maxCapacity;
//    }
//
//    public boolean isCapable(int currentCount) {
//        return currentCount < maxCapacity;
//    }
//}
