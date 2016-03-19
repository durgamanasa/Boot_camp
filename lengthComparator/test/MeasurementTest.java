import org.junit.Test;

import static org.junit.Assert.*;

public class MeasurementTest {
    @Test
    public void measurement_can_compare_feet_and_inches() {
        Measurement measurementInFeet = new Measurement(1,TypeOfUnit.Feet);
        Measurement measurementInInch = new Measurement(12,TypeOfUnit.Inch);
        assertEquals(measurementInFeet,measurementInInch);
    }

    @Test
    public void measurement_can_compare_inch_and_centi_meter() {
        Measurement measurementInInch = new Measurement(1,TypeOfUnit.Inch);
        Measurement measurementInCentiMeter = new Measurement(2.5,TypeOfUnit.Centimeter);
        assertEquals(measurementInInch,measurementInCentiMeter);
    }

    @Test
    public void measurement_can_compare_inch_and_centi_meter() {
        Measurement measurementInCentiMeter = new Measurement(1,TypeOfUnit.Centimeter);
        Measurement measurementInMillimeter = new Measurement(10,TypeOfUnit.Millimeter);
        assertEquals(measurementInCentiMeter,measurementInMillimeter);
    }

    @Test
    public void measurement_can_compare_gallon_and_litre() {
        Measurement measurementInGallon = new Measurement(1,TypeOfUnit.Gallon);
        Measurement measurementInLitre = new Measurement(3.78,TypeOfUnit.Litre);
        assertEquals(measurementInGallon,measurementInLitre);
    }

    @Test
    public void measurement_can_add_two_inches() {
        Measurement measurementInInch1 = new Measurement(2,TypeOfUnit.Inch);
        Measurement measurementInInch2 = new Measurement(3,TypeOfUnit.Inch);
        Measurement expected =  new Measurement(5,TypeOfUnit.Inch);
        assertEquals(expected,measurementInInch1.add(measurementInInch2));
    }

    @Test
    public void measurement_can_add_lengths_in_any_unit() {
        Measurement measurementInInch = new Measurement(2,TypeOfUnit.Inch);
        Measurement measurementInCentimeter = new Measurement(2.5,TypeOfUnit.Centimeter);
        Measurement expected =  new Measurement(3,TypeOfUnit.Inch);
        assertEquals(expected,measurementInInch.add(measurementInCentimeter));
    }

    @Test
    public void measurement_can_compare_volume_and_length() {
        Measurement measurementInGallon = new Measurement(1,TypeOfUnit.Gallon);
        Measurement measurementInInch = new Measurement(1,TypeOfUnit.Inch);
        assertEquals(measurementInGallon,measurementInInch);



    }
}