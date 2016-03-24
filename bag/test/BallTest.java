import ball.Ball;
import colour.Colour;
import org.junit.Test;

import static org.junit.Assert.*;

public class BallTest {

    @Test
    public void should_return_true_if_the_ball_is_of_given_colour() {
        Ball greenBall = Ball.createGreenBall();
        assertTrue(greenBall.isOfColour(Colour.GREEN));
    }

    @Test
    public void should_return_false_if_the_ball_is_not_of_given_colour() {
        Ball greenBall = Ball.createGreenBall();
        assertFalse(greenBall.isOfColour(Colour.RED));
    }

}