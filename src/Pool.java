// 1.41
public class Pool {
    double length; // m
    double width; // m
    double depth; // m

    Pool(double length, double width, double depth) {
        this.length = length;
        this.width = width;
        this.depth = depth;
    }

    double calculateVolume() {
        return this.length * this.width * this.depth;
    }

    double howMuchLeft(int age) {
        return (this.calculateVolume() * 1000) - (3 * age);
    }
}
