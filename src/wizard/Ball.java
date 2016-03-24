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