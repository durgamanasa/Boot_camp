package wizard;

import wizard.exception.BagIsFullException;
import wizard.exception.ColourIsFullException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bag {
    private static int MAXIMUM_SIZE = 12;
    private static int MAXIMUM_SIZE_OF_GREEN_BALLS = 3;
    private int numberOfBalls;
    private HashMap<Ball, BunchOfBalls> balls;
//    private List<Ball> balls;


    private Bag(int numberOfBalls) {
        this.numberOfBalls = numberOfBalls;
        balls = new HashMap<>();
    }

    public static Bag create(int numberOfBalls) throws BagIsFullException {
        if (numberOfBalls > MAXIMUM_SIZE) throw new BagIsFullException();
        return new Bag(numberOfBalls);
    }

    public void add(Ball ball) throws ColourIsFullException {
        if (balls.containsKey(ball))
            balls.get(ball).add(ball);
        balls.put(ball, )
    }

    private int countOf(Ball givenBall) {
        int count = 0;
        for (Ball ball : this.balls) {
            if (ball.equals(givenBall))
                count++;
        }
        return count;
    }


}
