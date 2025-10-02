public class Car {
    String make;
    String model;
    int year;
    String color;
    double price = 58000.99;
    boolean isRunning = false;

    public Car(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }
    public void start() {
        isRunning = true;
        System.out.println(make + " " + model + " is starting.");
    }

    public void drive() {
        isRunning = false;
        System.out.println(make + " " + model + " is driving.");
    }

    public void brake() {
        System.out.println(make + " " + model + " is braking.");
    }

    public void stop() {
        System.out.println(make + " " + model + " has stopped.");
    }

    @Override
    public String toString(){
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }
}
