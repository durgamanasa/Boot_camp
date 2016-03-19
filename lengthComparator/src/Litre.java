public class Litre implements Volume {

    private final double value;

    public Litre(double value) {
        this.value = value;
    }

    @Override
    public Litre convertToLitre() {
        return new Litre(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Litre litre = (Litre) o;

        return Double.compare(litre.value, value) == 0;

    }


}
