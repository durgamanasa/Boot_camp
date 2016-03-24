/*
Job: Store the ball in the bags(only 12 balls)
     Store only 3 green balls
     Store the red colour balls double of the green colour balls
     Store the as many blue balls as a bag can hold


 */

package wizard;

import wizard.exception.BagIsFullException;
import wizard.exception.ToManyGreenBallsException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Bag {

    private final ArrayList<Ball> balls;
    private final HashMap<Colours, Integer> capacityOfBalls;
    private final int maxCapacity = 12;

    public Bag() {
        balls = new ArrayList<>();
        capacityOfBalls = new HashMap<>();
        capacityOfBalls.put(Colours.GREEN, 3);
        capacityOfBalls.put(Colours.RED, 0);
        capacityOfBalls.put(Colours.YELLOW, (int) (0.4 * maxCapacity));
        capacityOfBalls.put(Colours.BLUE, maxCapacity);
    }

    public void add(Ball ball) throws BagIsFullException, ToManyGreenBallsException {
        if (balls.size() >= maxCapacity) throw new BagIsFullException();
        int capacity = capacityOfBalls.get(ball.getColour());
        if (capacity <= countOf(ball.getColour())) throw new ToManyGreenBallsException();
        balls.add(ball);
        updateCapacityOfBalls(ball.getColour());
    }

    public String getSummary() {
        HashMap<Colours, Integer> summary = new HashMap<>();
        for (Ball ball : balls) {
            if (!summary.containsKey(ball.getColour())) {
                summary.put(ball.getColour(), countOf(ball.getColour()));
            }
        }
        String result = "bag: " + balls.size();
        for (Map.Entry<Colours, Integer> entry : summary.entrySet()) {
            result += String.format("\n%s : %s", entry.getKey(), entry.getValue());
        }
        return result;
    }

    private void updateCapacityOfBalls(Colours colour) {
        if (colour.equals(Colours.GREEN))
            capacityOfBalls.put(Colours.RED, countOf(colour) * 2);
    }

    private int countOf(Colours colour) {
        int count = 0;
        for (Ball ball : this.balls) {
            if (ball.isOfSameColour(colour)) {
                count++;
            }
        }
        return count;
    }
}