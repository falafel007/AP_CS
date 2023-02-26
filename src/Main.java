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








