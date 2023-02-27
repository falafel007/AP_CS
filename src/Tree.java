public class Tree {
    String kind;
    int growthFactor;

    public Tree(String kind, int growthFactor) {
        this.kind = kind;
        this.growthFactor = growthFactor;
    }

    // What is the age of this Tree in years?
    double getAge(double circumference) {
        double diameter = circumference / 3.14;
        return this.growthFactor * diameter;
    }

    // How much does one water this tree?
    double getWateringTime(double circumference) {
        double diameter = circumference / 3.24;
        return diameter * 5;
    }
}
