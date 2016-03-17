package chance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChanceTest {
    @Test
    public void should_give_zero_point_five_as_a_chance_when_it_is_flipped() {
        double totalSpace = 2;
        Chance chance = new Chance(totalSpace);
        int noOfItems = 1;
        assertEquals(0.5, chance.chanceOfGettingTail(noOfItems) , 0);
    }

    @Test
    public void should_give_zero_point_four_as_chance_of_not_getting_tail_for_one_coin() {
        double totalSpace = 2;
        Chance chance = new Chance(totalSpace);
        int noOfItems = 1;
        assertEquals(0.5, chance.ChanceOfNotGettingTail(noOfItems), 0);
    }

    @Test
    public void should_give_one_by_four_when_two_coins_are_flipped() {
        double totalSpace = 2;
        Chance chance = new Chance(totalSpace);
        int noOfItems = 2;
        assertEquals(0.25, chance.chanceOfGettingTail(noOfItems), 0);

    }
}
