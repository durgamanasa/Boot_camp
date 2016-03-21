import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class MeasurementTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void measurement_should_return_true_if_two_lengths_are_equal() throws InvalidMeasurementEqualityException {
        Measurement measurementInFeet = new Measurement(2, LengthUnits.Feet);
        Measurement measurementInInch = new Measurement(24, LengthUnits.Inch);
        assertTrue(measurementInFeet.isEqualTo(measurementInInch));
    }

    @Test
    public void measurement_should_return_false_if_two_lengths_are_not_equal() throws InvalidMeasurementEqualityException {
        Measurement measurementInFeet = new Measurement(2, LengthUnits.Feet);
        Measurement measurementInInch = new Measurement(14, LengthUnits.Inch);
        assertFalse(measurementInFeet.isEqualTo(measurementInInch));
    }

    @Test
    public void measurement_can_compare_inch_and_centimeter() throws InvalidMeasurementEqualityException {
        Measurement measurementInInch = new Measurement(1, LengthUnits.Inch);
        Measurement measurementInCentimeter = new Measurement(2.5, LengthUnits.Centimeter);
        assertTrue(measurementInInch.isEqualTo(measurementInCentimeter));
    }

    @Test
    public void measurement_can_compare_centimeter_and_millimeter() throws InvalidMeasurementEqualityException {
        Measurement measurementInCentimeter = new Measurement(1, LengthUnits.Centimeter);
        Measurement measurementInMillimeter = new Measurement(10, LengthUnits.Millimeter);
        assertTrue(measurementInCentimeter.isEqualTo(measurementInMillimeter));
    }

    @Test
    public void measurement_can_compare_gallon_and_litre() throws InvalidMeasurementEqualityException {
        Measurement measurementInGallon = new Measurement(1, VolumeUnits.Gallon);
        Measurement measurementInLitre = new Measurement(3.78, VolumeUnits.Litre);
        assertTrue(measurementInGallon.isEqualTo(measurementInLitre));
    }
    @Test
    public void measurement_can_add_two_same_lengths() throws InvalidMeasurementEqualityException, AdditionOfDifferentMeasurementUnitsException {
        Measurement measurementInInch1 = new Measurement(2, LengthUnits.Inch);
        Measurement measurementInInch2 = new Measurement(3, LengthUnits.Inch);
        Measurement expected = new Measurement(5, LengthUnits.Inch);
        assertTrue(expected.isEqualTo(measurementInInch1.add(measurementInInch2)));
    }

    @Test
    public void measurement_should_return_sum_in_standard_unit() throws InvalidMeasurementEqualityException, AdditionOfDifferentMeasurementUnitsException {
        Measurement measurementInInch = new Measurement(2, LengthUnits.Inch);
        Measurement measurementInCentimeter = new Measurement(2.5, LengthUnits.Centimeter);
        Measurement sum = measurementInInch.add(measurementInCentimeter);
        Measurement expected = new Measurement(7.5, LengthUnits.Centimeter);
        assertTrue(expected.isEqualTo(sum));
        assertTrue(sum.isInStandardUnit());
    }

    @Test
    public void measurement_should_throw_InvalidMeasurementEqualityException_for_Length_and_Volume() throws InvalidMeasurementEqualityException {
        thrown.expect(InvalidMeasurementEqualityException.class);
        thrown.expectMessage("You can't compare two different types of measurements");
        Measurement measurementInInch = new Measurement(2, LengthUnits.Inch);
        Measurement measurementInGallon = new Measurement(1, VolumeUnits.Gallon);
        assertTrue(measurementInInch.isEqualTo(measurementInGallon));
    }
    @Test
    public void measurement_should_throw_AdditionOfDifferentMeasurementUnitsException_when_the_Length_and_Volume_is_added() throws  AdditionOfDifferentMeasurementUnitsException {
        thrown.expect(AdditionOfDifferentMeasurementUnitsException.class);
        thrown.expectMessage("You can't add two different units of measurements");
        Measurement measurementInInch = new Measurement(2, LengthUnits.Inch);
        Measurement measurementInGallon = new Measurement(1, VolumeUnits.Gallon);
        measurementInInch.add(measurementInGallon);
    }

}