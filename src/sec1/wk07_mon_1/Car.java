package sec1.wk07_mon_1;

public class Car {
    private String make;
    private String model;
    private int year;

    private static int carCount = 0;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.year = 0;
        carCount++;
        Main.bar(this.make);
    }

    public Car(String make, String model, int year) {
//        this.make = make;
//        this.model = model;
//        new Car(make, model);
        this(make, model);
        this.year = year;
    }

    public boolean equals(Car c){
        return c.make.equals(this.make) && c.model.equals(this.model);
    }

    public String toString( ) {
        return make + ": " + model + "(" + year + ")";
    }

    public static int getCarCount() {
        return carCount;
    }
}
