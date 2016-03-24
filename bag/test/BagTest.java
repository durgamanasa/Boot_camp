import bag.Bag;
import ball.Ball;
import exception.BagFullException;
import exception.ToManyGreenBallsException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import rule.Rules;
import rules.BlueBallLimitRule;
import rules.GreenBallLimitRule;
import rules.RedBallLimitRule;
import rules.YellowBallLimitRule;

public class BagTest {
    private Bag bag;

    @Before
    public void setUp() throws Exception {
        Rules rules = new Rules();
        rules.add(new GreenBallLimitRule());
        rules.add(new YellowBallLimitRule());
        rules.add(new RedBallLimitRule());
        rules.add(new BlueBallLimitRule());
        this.bag = new Bag(12, rules);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void bag_should_store_only_12_balls_() throws BagFullException {
        for (int index = 0; index < 12; index++) {
            bag.add(Ball.createGreenBall());
        }
        thrown.expect(BagFullException.class);
        thrown.expectMessage("Bag is full you can not store more than 12 balls");
        bag.add(Ball.createGreenBall());
    }

    @Test
    public void bag_should_store_only_3_green_balls() throws BagFullException {
        bag.add(Ball.createGreenBall());
        bag.add(Ball.createGreenBall());
        bag.add(Ball.createGreenBall());
        thrown.expect(ToManyGreenBallsException.class);
        thrown.expectMessage("You can't add more that three green balls");
        bag.add(Ball.createGreenBall());
    }
}