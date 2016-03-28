package rule;

import ball.Ball;
import ball.Balls;
import exception.RedBallIsNotAllowedException;
import exception.ToManyGreenBallsException;

public interface Rule {
    boolean canBallBeAdded(Ball ball, Balls balls) throws ToManyGreenBallsException;
}
