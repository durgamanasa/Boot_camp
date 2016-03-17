import org.hamcrest.CoreMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertEquals;

public class RectangleTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void should_calculate_the_area_when_length_and_breadth_are_positive() throws InvalidDimensionException {
        Rectangle rectangle = Rectangle.create(4, 5);
        double area = rectangle.calculateArea();
        assertEquals(20, area, 0);
    }

    @Test
    public void should_calculate_the_area_when_length_or_breadth_is_zero() throws InvalidDimensionException {
        Rectangle rectangle = Rectangle.create(10, 0);
        double area = rectangle.calculateArea();
        assertEquals(0, area, 0);
    }

    @Test
    public void should_calculate_the_perimeter_when_length_and_breadth_are_positive() throws InvalidDimensionException {
        Rectangle rectangle = Rectangle.create(2, 6);
        double perimeter = rectangle.calculatePerimeter();
        assertEquals(16, perimeter, 0);
    }

    @Test
    public void should_throw_InvalidDimensionException_when_length_is_non_positive() throws InvalidDimensionException {
        thrown.expect(InvalidDimensionException.class);
        thrown.expectMessage(CoreMatchers.is("Invalid Dimension, provide positive dimension"));
        Rectangle rectangle = Rectangle.create(-10,4);
    }

    @Test
    public void should_throw_InvalidDimensionException_when_breadth_is_non_positive() throws InvalidDimensionException {
        thrown.expect(InvalidDimensionException.class);
        thrown.expectMessage(CoreMatchers.is("Invalid Dimension, provide positive dimension"));
        Rectangle rectangle = Rectangle.create(10,-4);
    }

    @Test
    public void should_throw_InvalidDimensionException_when_length_and_breadth_both_are_non_positive() throws InvalidDimensionException {
        thrown.expect(InvalidDimensionException.class);
        thrown.expectMessage(CoreMatchers.startsWith("Invalid Dimension"));
        Rectangle rectangle = Rectangle.create(-6,-4);
    }
}