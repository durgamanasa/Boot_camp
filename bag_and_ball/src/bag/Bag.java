package bag;

import ball.Ball;
import ball.Balls;
import exception.BagFullException;
import exception.RedBallIsNotAllowedException;
import exception.ToManyGreenBallsException;
import rule.Rule;
import rule.Rules;

public class Bag {
    private final Balls balls;
    private final int noOfAllowedBalls;
    private Rules rules;

    public Bag(int noOfAllowedBalls, Rules rules) {
        this.noOfAllowedBalls = noOfAllowedBalls;
        this.rules = rules;
        this.balls = new Balls();
    }

    public void add(Ball ball) throws ToManyGreenBallsException{
        for (Rule rule : rules) {
            rule.canBallBeAdded(ball, balls);
        }
        balls.add(ball);
        System.out.println(balls.size());
    }
}
