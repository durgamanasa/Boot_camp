import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void test_calculateArea_should_return_the_area_of_the_rectangle() throws Exception {
        Rectangle rectangle = new Rectangle(4, 5);
        double area = rectangle.calculateArea();
        Assert.assertEquals(20,area,0);
    }

    @Test
    public void test_calculatePerimeter_should_return_the_perimeter_of_the_rectangle() throws Exception {
        Rectangle rectangle = new Rectangle(2,6);
        double perimeter = rectangle.calculatePerimeter();
        Assert.assertEquals(16, perimeter, 0);

    }
}