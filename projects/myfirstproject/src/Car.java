public class Car {
    private final String model;
    private String color;
    private int price;

    Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel(){
        return this.model;
    }
    String getColor(){
        return this.color;
    }
    int getPrice(){
        return this.price;
    }

    void setColor(String color){
        this.color = color;
    }

    void setPrice(int price){
       if(this.price < 0){
            System.out.println("The price can't be less than zero");
       }else{
         this.price = price;
       }
    }

    // Car car = new Car("Mustang", "Red", 100000);
    
    // car.setColor("Blue");
    // car.setPrice(5000);

    // System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
}
