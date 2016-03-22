package wizard;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import wizard.exception.BagIsFullException;
import wizard.exception.ColourIsFullException;


public class BagTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void bag_should_store_only_12_balls() throws BagIsFullException, ColourIsFullException {
        Bag bag = new Bag();
        thrown.expect(BagIsFullException.class);
        thrown.expectMessage("You can not store more than 12 balls in the Bag");
        for (int index = 0; index < 13; index++) {
            bag.add(new Ball(Colours.BLUE));
        }
    }

    @Test
    public void Bag_should_not_store_more_than_three_green_balls() throws BagIsFullException, ColourIsFullException {
        thrown.expect(ColourIsFullException.class);
        thrown.expectMessage("You can't store more than three green balls");
        Bag bag = new Bag();
        bag.add(new Ball(Colours.GREEN));
        bag.add(new Ball(Colours.GREEN));
        bag.add(new Ball(Colours.GREEN));
        bag.add(new Ball(Colours.GREEN));
    }

    @Test
    public void bag_can_store_red_balls_double_of_the_green_balls() throws ColourIsFullException, BagIsFullException {
        thrown.expect(ColourIsFullException.class);
        thrown.expectMessage("You can't store more than three green balls");
        Bag bag = new Bag();
        bag.add(new Ball(Colours.RED));
    }

    @Test
    public void bag_can_give_detailed_summary() throws ColourIsFullException, BagIsFullException {
        String expected = "bag: 2\nGREEN : 1\nRED : 1";
        Bag bag = new Bag();
        bag.add(new Ball(Colours.GREEN));
//        bag.add(new Ball(Colours.RED));
        bag.add(new Ball(Colours.RED));
        Assert.assertEquals(expected,bag.getSummary());
    }
}