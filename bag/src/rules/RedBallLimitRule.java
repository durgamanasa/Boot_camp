package rules;

import ball.Ball;
import ball.Balls;
import rule.Rule;

public class RedBallLimitRule implements Rule {
    @Override
    public boolean canBallBeAdded(Ball ball, Balls balls) {
        return false;
    }
}
