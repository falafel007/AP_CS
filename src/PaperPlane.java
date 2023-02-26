// 1.2.1
public class PaperPlane {
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

