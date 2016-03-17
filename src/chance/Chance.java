/*
    Job of Chance:
        - to calculate the chance,  given some sample space and total space
 */
package chance;

public class Chance {

    private double totalSpace;

    public Chance(double totalSpace) {
        this.totalSpace = totalSpace;
    }

    public double chanceOfGettingTail(int noOfItems) {
        return 1 / Math.pow(totalSpace, noOfItems);
    }

    public double ChanceOfNotGettingTail(int noOfItems) {
        return 1 - chanceOfGettingTail(noOfItems);
    }
}
