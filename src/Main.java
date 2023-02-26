public class Main {
    public static void main(String[] args) {
        System.out.println(roderic.name);
        System.out.println(p.convertToPound());
        System.out.println(p.calculateBMI());
        System.out.println(sleigh.convertToString());
        System.out.println(sleigh);

    }
    static Person roderic = new Person("Roderic", 35, 80.5, 183);
    static Person p = new Person("Hossein", 35, 80.5, 183);
    // 1.2.2
    static PaperPlane sleigh = new PaperPlane(6.706,"Santa Clause", true, 2, 452);
}

// represent the "health" information about a person
class Person {
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


// 1.2.1
class PaperPlane {
    double speed; //mph
    String owner; // company
    boolean international; //fly international?
    int passengers; // people
    double maxWeight; //kg

    PaperPlane(double speed, String owner, boolean international, int passengers, double maxWeight) {
        this.speed = speed;
        this.owner = owner;
        this.international = international;
        this.passengers = passengers;
        this.maxWeight = maxWeight;
    }

    // 1.3.1 Converts weight to imperial pounds
    double convertToPound() {
        return this.maxWeight * 2.20462;
    }

    // 1.3.2 Describes the important fields of PaperPlane
    String convertToString() {
        return "Speed: " + this.speed + "\nOwner: " + this.owner + "\nMax Weight: " + this.maxWeight;
    }

}


