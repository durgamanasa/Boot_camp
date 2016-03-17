import org.hamcrest.CoreMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class SquareTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void should_calculate_the_area_when_side_is_positive() throws InvalidDimensionException {
        Square square = Square.create(4);
        double area = square.calculateArea();
        assertEquals(16, area, 0);
    }

    @Test
    public void should_calculate_the_area_and_gives_zero_when_side_is_zero() throws InvalidDimensionException {
        Square square = Square.create(0);
        double area = square.calculateArea();
        assertEquals(0, area, 0);
    }

    @Test
    public void should_calculate_the_perimeter_when_side_is_positive() throws InvalidDimensionException {
        Square square = Square.create(4);
        double perimeter = square.calculatePerimeter();
        assertEquals(16, perimeter, 0);
    }

    @Test
    public void should_calculate_the_perimeter_and_gives_zero_when_side_is_zero() throws InvalidDimensionException {
        Square square = Square.create(0);
        double perimeter = square.calculatePerimeter();
        assertEquals(0, perimeter, 0);
    }

    @Test
    public void should_throw_InvalidDimensionException_when_side_is_non_positive() throws InvalidDimensionException {
        thrown.expect(InvalidDimensionException.class);
        thrown.expectMessage(CoreMatchers.startsWith("Invalid Dimension"));
        Square square = Square.create(-3);

    }
}