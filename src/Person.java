// represent the "health" information about a person
public class Person {
    String name; // first name
    int age;
    double weight; //kg
    double height; //cm

    Person(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    // Converts kg to lb
    double convertToPound() {
        return this.weight * 2.20462;
    }

    // Determine the BMI for a person
    public double calculateBMI() {
        double heightInMeters = this.height / 100.0;
        return this.weight / (heightInMeters * heightInMeters);
    }
}
