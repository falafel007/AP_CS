public class Food {
    String name;
    double calories;

    Food(String name, double calories) {
        this.name = name;
        this.calories = calories;
    }

    // What percent of the daily intake does this food represent?
    // What class does this method belong to: Person or Food? Follow the 'this.' It's Food.
    double caloriePercentPoint(int dailyCalories) {
        double percentage = this.calories / dailyCalories;
        return percentage * 100;
    }

}
