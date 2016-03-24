package rule;

import ball.Ball;
import ball.Balls;
import exception.ToManyGreenBallsException;

public interface Rule {
    boolean canBallBeAdded(Ball ball, Balls balls) throws ToManyGreenBallsException;
}
