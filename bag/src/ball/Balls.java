package ball;

import colour.Colour;

import java.util.ArrayList;

public class Balls {

    private final ArrayList<Ball> balls = new ArrayList<Ball>();

    public int countOf(Colour colour) {
        int count = 0;
        for (Ball ball : this.balls) {
            if (ball.isOfColour(colour)) {
                count++;
            }
        }
        return count;
    }

    public int size() {
        return balls.size();
    }

    public boolean add(Ball ball) {
        return balls.add(ball);
    }
}
