package thisKeywordPractice;

public class Car {
    String model;
    String color;
    double price;

    public Car(String model) {
        this(model,"Blue",50000000);
    }

    public Car(String model, String color) {
        this(model, color, 50000000);
    }

    public Car(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
}
