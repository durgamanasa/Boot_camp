public enum LengthUnits implements MeasurementUnits {
    Feet(12),
    Inch(1),
    Centimeter(0.4),
    Millimeter(0.04);

    private final double conversionFactor;

    LengthUnits(double unit) {
        conversionFactor = unit;
    }

    @Override
    public double convertToBaseUnit() {
        return conversionFactor;
    }

    @Override
    public MeasurementUnits getStandardUnit() {
        return Inch;
    }
}
