package wizard;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import wizard.exception.BagIsFullException;
import wizard.exception.ColourIsFullException;

import static org.junit.Assert.*;

public class BagTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void Bag_should_throw_BagIsFullException_when_more_than_12_balls_stored() throws BagIsFullException {
        thrown.expect(BagIsFullException.class);
        thrown.expectMessage("You can not store more than 12 balls");
        Bag bag = Bag.create(13);
    }

    @Test
    public void Bag_should_stored_only_three_green_balls() throws BagIsFullException, ColourIsFullException {
        thrown.expect(ColourIsFullException.class);
        thrown.expectMessage("More of this colour is not allowed");
        Bag bag = Bag.create(10);
        bag.add(Ball.GREEN);
        bag.add(Ball.GREEN);
        bag.add(Ball.GREEN);
        bag.add(Ball.GREEN);
    }
}