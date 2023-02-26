// 1.4.3
public class WateringDay {
    int howMuch;
    String nextDay;

    WateringDay(int howMuch, String nextDay) {
        this.howMuch = howMuch;
        this.nextDay = nextDay;
    }

    String alarm() {
        return "Water on " + nextDay + " with " + this.howMuch;
    }
}
