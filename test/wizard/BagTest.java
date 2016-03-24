package wizard;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import wizard.exception.BagIsFullException;
import wizard.exception.RestrictedRedBallsException;
import wizard.exception.ToManyGreenBallsException;


public class BagTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void should_throw_BagIsFullException_when_we_store_more_than_12_balls() throws BagIsFullException, ToManyGreenBallsException {
        Bag bag = new Bag();
        thrown.expect(BagIsFullException.class);
        thrown.expectMessage("Bag is full,you can not store more than 12 balls in the Bag");
        for (int index = 0; index < 13; index++) {
            bag.add(new Ball(Colours.BLUE));
        }
    }

    @Test
    public void Bag_should_throw_ColourIsFullException_when_we_store_more_than_3_green_balls() throws BagIsFullException, ToManyGreenBallsException {
        Bag bag = new Bag();
        bag.add(new Ball(Colours.GREEN));
        bag.add(new Ball(Colours.GREEN));
        bag.add(new Ball(Colours.GREEN));
        thrown.expect(ToManyGreenBallsException.class);
        thrown.expectMessage("You can't store more than three green balls");
        bag.add(new Ball(Colours.GREEN));
    }

    @Test
    public void bag_can_store_red_balls_as_double_of_the_green_balls() throws ToManyGreenBallsException, BagIsFullException{
        thrown.expect(RestrictedRedBallsException.class);
        thrown.expectMessage("Bag can't store red balls if there is green ball in the bag");
        Bag bag = new Bag();
        bag.add(new Ball(Colours.RED));
    }

    @Test
    public void bag_can_give_detailed_summary() throws ToManyGreenBallsException, BagIsFullException{
        String expected = "bag: 3\nGREEN : 1\nRED : 2";
        Bag bag = new Bag();
        bag.add(new Ball(Colours.GREEN));
        bag.add(new Ball(Colours.RED));
        bag.add(new Ball(Colours.RED));
        Assert.assertEquals(expected,bag.getSummary());
    }
}