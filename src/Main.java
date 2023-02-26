public class Main {
    public static void main(String[] args) {
        System.out.println(roderic.name);
        System.out.println(sleigh.passengers);
    }
    static Person roderic = new Person("Roderic", 35, 80.5, 183);
    static PaperAirplane sleigh = new PaperAirplane(6.706,"Santa Clause", true, 2);
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

}



class PaperAirplane {
    double speed; //mph
    String owner; // company
    boolean international; //fly international?
    int passengers; // number of passengers

    PaperAirplane(double speed, String owner, boolean international, int passengers) {
        this.speed = speed;
        this.owner = owner;
        this.international = international;
        this.passengers = passengers;
    }
}


