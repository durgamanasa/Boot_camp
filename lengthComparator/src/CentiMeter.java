public class CentiMeter implements MyLength {
    private double value;
    private Comparator comparator;

    public CentiMeter(double value,Comparator comparator) {
        this.value = value;
        this.comparator = comparator;
    }

    @Override
    public MM convertToMM() {
        return new MM(value*10);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof MyLength)) return false;
        MyLength castedObject = (MyLength) o;
        return comparator.areEqual(this,castedObject);
    }
}
