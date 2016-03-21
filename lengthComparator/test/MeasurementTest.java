import org.junit.Test;

import static org.junit.Assert.*;

public class MeasurementTest {
    @Test
    public void measurement_should_return_true_if_two_lengths_are_equal() {
        Measurement measurementInFeet = new Measurement(2, LengthUnits.Feet);
        Measurement measurementInInch = new Measurement(24, LengthUnits.Inch);
        assertTrue(measurementInFeet.isEqualTo(measurementInInch));
    }

    @Test
    public void measurement_should_return_false_if_two_lengths_are_not_equal() {
        Measurement measurementInFeet = new Measurement(2, LengthUnits.Feet);
        Measurement measurementInInch = new Measurement(14, LengthUnits.Inch);
        assertFalse(measurementInFeet.isEqualTo(measurementInInch));
    }

    @Test
    public void measurement_can_compare_inch_and_centimeter() {
        Measurement measurementInInch = new Measurement(1, LengthUnits.Inch);
        Measurement measurementInCentimeter = new Measurement(2.5, LengthUnits.Centimeter);
        assertTrue(measurementInInch.isEqualTo(measurementInCentimeter));
    }

    @Test
    public void measurement_can_compare_centimeter_millimeter() {
        Measurement measurementInCentimeter = new Measurement(1, LengthUnits.Centimeter);
        Measurement measurementInMillimeter = new Measurement(10, LengthUnits.Millimeter);
        assertTrue(measurementInCentimeter.isEqualTo(measurementInMillimeter));
    }

    @Test
    public void measurement_can_compare_gallon_and_litre() {
        Measurement measurementInGallon = new Measurement(1, VolumeUnits.Gallon);
        Measurement measurementInLitre = new Measurement(3.78, VolumeUnits.Litre);
        assertTrue(measurementInGallon.isEqualTo(measurementInLitre));
    }

    @Test
    public void measurement_can_add_two_inches() {
        Measurement measurementInInch1 = new Measurement(2, LengthUnits.Inch);
        Measurement measurementInInch2 = new Measurement(3, LengthUnits.Inch);
        Measurement expected = new Measurement(5, LengthUnits.Inch);
        assertTrue(expected.isEqualTo(measurementInInch1.add(measurementInInch2)));
    }

    @Test
    public void measurement_can_add_lengths_in_any_unit() {
        Measurement measurementInInch = new Measurement(2, LengthUnits.Inch);
        Measurement measurementInCentimeter = new Measurement(2.5, LengthUnits.Centimeter);
        Measurement expected = new Measurement(3, LengthUnits.Inch);
        assertTrue(expected.isEqualTo(measurementInInch.add(measurementInCentimeter)));
    }
}