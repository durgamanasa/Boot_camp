package ball;

import colour.Colour;

public class Ball {
    private Colour colour;

    private Ball(Colour colour) {
        this.colour = colour;
    }

    public boolean isOfColour(Colour otherColour) {
        return this.colour == otherColour;
    }

    public static Ball createGreenBall() {
        return new Ball(Colour.GREEN);
    }

    public static Ball createYellowBall() {
        return new Ball(Colour.YELLOW);
    }

    public static Ball createRedBall() {
        return new Ball(Colour.RED);
    }

    public static Ball createBlueBall() {
        return new Ball(Colour.BLUE);
    }
}
