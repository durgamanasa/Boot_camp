public enum VolumeUnits implements MeasurementUnits {
    Gallon(3.78),
    Litre(1);

    private final double conversionFactor;

    VolumeUnits(double unit) {
        conversionFactor = unit;
    }
    @Override
    public double convertToBaseUnit(){
        return conversionFactor;
    }

    @Override
    public MeasurementUnits getStandardUnit() {
        return Litre;
    }
}
