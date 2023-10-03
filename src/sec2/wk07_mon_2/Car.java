package sec2.wk07_mon_2;

public class Car {
    private String make;
    private String model;
    private int year;

    private static int carCount = 0;

    public Car(String make, String model) {
        System.out.println("first constructor");
        this.make = make;
        this.model = model;
        this.year = 1900; // all cars were made in 1900
        carCount++;
    }

    public Car(String make, String model, int year) {
        this(make, model);
        System.out.println("second constructor");
//        this.make = make;
//        this.model = model;
        this.year = year;
    }

    public static int getCarCount() {
        return carCount;
    }

    public String toString() {
        return make + ": " + model + "(" + year + ")";
    }
}
