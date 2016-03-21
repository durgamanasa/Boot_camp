/*
Job:    Checks two measurements are equal or not
        Adds two measurements
 */
public class Measurement {
    private double quantity;
    private MeasurementUnits unit;

    public Measurement(double quantity, MeasurementUnits unit) {
        this.quantity = quantity;
        this.unit = unit;
    }

    private Measurement convertToBase() {
        return new Measurement(quantity * unit.convertToBaseUnit(), unit.getStandardUnit());
    }

    private Class<? extends MeasurementUnits> getType() {
        return unit.getClass();
    }

    private boolean isSameTypeOfMeasurement(Measurement otherMeasurement){
        return this.getType() == otherMeasurement.getType();
    }

    public boolean isEqualTo(Measurement otherMeasurement) throws InvalidMeasurementEqualityException {
        if (!isSameTypeOfMeasurement(otherMeasurement))
            throw new InvalidMeasurementEqualityException();
        Measurement thisAsStandardMeasurement = this.convertToBase();
        Measurement otherAsStandardMeasurement = otherMeasurement.convertToBase();
        return thisAsStandardMeasurement.quantity == otherAsStandardMeasurement.quantity;
    }

    public Measurement add(Measurement otherMeasurement) throws AdditionOfDifferentMeasurementUnitsException {
        if (!isSameTypeOfMeasurement(otherMeasurement))
            throw new AdditionOfDifferentMeasurementUnitsException();
        Measurement thisAsStandardMeasurement = this.convertToBase();
        Measurement otherAsStandardMeasurement = otherMeasurement.convertToBase();
        double sum = thisAsStandardMeasurement.quantity + otherAsStandardMeasurement.quantity;
        return new Measurement(sum, unit.getStandardUnit());
    }
}
