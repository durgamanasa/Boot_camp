/*
    Job : To compare any two Lengths
 */
public class Comparator {

    public boolean areEqual(MyLength length, MyLength otherLength) {
        MM lengthInMM = length.convertToMM();
        MM otherLengthInMM = otherLength.convertToMM();
        return lengthInMM.equals(otherLengthInMM);
    }

    public boolean areEqual(Volume volume, Volume otherVolume) {
        Litre volumeInLitre = volume.convertToLitre();
        Litre otherVolumeInLitre = otherVolume.convertToLitre();
        return volumeInLitre.equals(otherVolumeInLitre);
    }
}
