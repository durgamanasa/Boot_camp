import sun.security.util.Length;

public class Inch implements MyLength {

    private int value;
    private Comparator comparator;

    public Inch(int value, Comparator comparator) {
        this.value = value;
        this.comparator = comparator;
    }

//    public Inch add(MyLength length){
//        MM lengthInMM = length.convertToMM();
//        MM InchInMM = this.convertToMM();
//        MM sumInMM = InchInMM.add(lengthInMM);
//        Inch sumInInch = sumInMM/25;
//        return sumInInch;
//    }
    @Override
    public MM convertToMM() {
        return new MM(value*25);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof MyLength)) return false;
        MyLength castedObject = (MyLength) o;
        return comparator.areEqual(this,castedObject);
    }

    public Inch add(Inch otherLength) {
        return new Inch(value+otherLength.value,new Comparator());
    }
}
