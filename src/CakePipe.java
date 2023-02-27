// 1.5.2
public class CakePipe {
    double radius; //cm
    double height; //cm
    String flavor;

    CakePipe(double radius, double height, String flavor) {
        this.radius = radius;
        this.height = height;
        this.flavor = flavor;
    }

    double volume() {
        double baseArea = 3.14 * this.radius * this.radius;
        return baseArea * this.height;
    }
}
