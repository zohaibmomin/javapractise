public class FinalImplementation {
    final double rateOfInterest;

    public FinalImplementation(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public String toString() {
        return "FinalImplementation : rateOfInterest : " + this.rateOfInterest;

    }

    public static void main(String[] args) {
        FinalImplementation fo = new FinalImplementation(6.7);
        System.out.println(fo);
//        fo.rateOfInterest = 9;

    }
}
