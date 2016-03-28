package rules;

import ball.Ball;
import ball.Balls;
import colour.Colour;
import exception.ToManyGreenBallsException;
import rule.Rule;

public class GreenBallLimitRule implements Rule {
    @Override
    public boolean canBallBeAdded(Ball thisBall, Balls balls) throws ToManyGreenBallsException {
        int countOfGreenBalls = balls.countOf(Colour.GREEN);
        if (countOfGreenBalls >= 3) throw new ToManyGreenBallsException();
        return true;
    }


}
