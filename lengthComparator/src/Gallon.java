public class Gallon implements Volume{
    private double value;
    private Comparator comparator;

    public Gallon(double value, Comparator comparator) {
        this.value = value;
        this.comparator = comparator;
    }

    @Override
    public Litre convertToLitre() {
        return new Litre(value*3.78);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Volume)) return false;
        Volume castedObject = (Volume) o;
        return comparator.areEqual(this,castedObject);
    }
}
