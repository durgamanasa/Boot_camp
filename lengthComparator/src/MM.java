public class MM implements MyLength {
    private double value;

    public MM(double value) {
        this.value = value;
    }

    @Override
    public MM convertToMM() {
        return new MM(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MM mm = (MM) o;
        return value == mm.value;
    }


    public MM add(MM otherLength) {
        return new MM(value+otherLength.value);
    }
}
