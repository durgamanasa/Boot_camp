import sun.security.util.Length;

public class Feet implements MyLength {
    private int value;
    private Comparator comparator;

    public Feet(int value,Comparator comparator) {
        this.value = value;
        this.comparator = comparator;
    }

    @Override
    public MM convertToMM() {
        return new MM(value*300);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof MyLength)) return false;
        MyLength castedObject = (MyLength) o;
        return comparator.areEqual(this,castedObject);
    }


}
