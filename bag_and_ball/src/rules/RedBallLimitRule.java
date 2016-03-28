package rules;

import ball.Ball;
import ball.Balls;
import colour.Colour;
import exception.RedBallIsNotAllowedException;
import rule.Rule;

public class RedBallLimitRule implements Rule {
    @Override
    public boolean canBallBeAdded(Ball ball, Balls balls){
//        int countOfGreenBalls = balls.countOf(Colour.GREEN);
//        if (countOfGreenBalls < 1) throw new RedBallIsNotAllowedException();
        return false;
    }
}
