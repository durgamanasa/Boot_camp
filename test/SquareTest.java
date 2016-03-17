import org.hamcrest.CoreMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SquareTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void should_throw_InvalidDimensionException_when_side_is_non_positive() throws InvalidDimensionException {
        thrown.expect(InvalidDimensionException.class);
        thrown.expectMessage(CoreMatchers.startsWith("Invalid Dimension"));
        Square square = Square.create(-3);
    }

}