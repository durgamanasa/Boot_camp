package bag;

import ball.Ball;
import ball.Balls;
import exception.BagFullException;
import rule.Rule;
import rule.Rules;

public class Bag {
    private final Balls balls;
    private int noOfAllowedBalls;
    private Rules rules;

    public Bag(int noOfAllowedBalls, Rules rules) {
        this.noOfAllowedBalls = noOfAllowedBalls;
        this.rules = rules;
        this.balls = new Balls();
    }

    public void add(Ball ball) {
        for (Rule rule : rules) {
//            rule.canBallBeAdded(ball, balls);
        }
        balls.add(ball);
    }
}
