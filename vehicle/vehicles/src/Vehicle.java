public class Vehicle {
    String model;
    String color;

    Vehicle(String model, String color){
        this.model = model;
        this.color = color;
    }

    void drive() {
        System.out.println("You drive the "+ this.color +" "+ this.model);
    }
}
