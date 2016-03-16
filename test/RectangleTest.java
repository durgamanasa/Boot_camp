import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RectangleTest {
    @Test
    public void calculateArea_should_return_the_area_of_the_rectangle() throws Exception {
        Rectangle rectangle = new Rectangle(4, 5);
        double area = rectangle.calculateArea();
        assertEquals(20,area,0);
    }

    @Test
    public void calculatePerimeter_should_return_the_perimeter_of_the_rectangle() throws Exception {
        Rectangle rectangle = new Rectangle(2,6);
        double perimeter = rectangle.calculatePerimeter();
        assertEquals(16, perimeter, 0);

    }

}