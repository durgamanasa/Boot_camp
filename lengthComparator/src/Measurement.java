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

    public boolean isEqualTo(Measurement otherMeasurement) {
        Measurement thisAsStandardMeasurement = this.convertToBase();
        Measurement otherAsStandardMeasurement = otherMeasurement.convertToBase();
        return thisAsStandardMeasurement.quantity == otherAsStandardMeasurement.quantity;
    }

    public Measurement add(Measurement otherMeasurement) {
        Measurement thisAsStandardMeasurement = this.convertToBase();
        Measurement otherAsStandardMeasurement = otherMeasurement.convertToBase();
        double sum = thisAsStandardMeasurement.quantity + otherAsStandardMeasurement.quantity;
        return new Measurement(sum, unit.getStandardUnit());
    }
}
