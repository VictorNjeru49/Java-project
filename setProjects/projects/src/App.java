
import java.util.Scanner;

public class App {
    public static void main(String[] args){

      Scanner scanner = new Scanner(System.in);

      Animal animal;

      System.out.print("Would you like a dog or a cat? (1 = dog, 2 = cat)");
      int choice = scanner.nextInt();

      if(choice == 1){
        animal = new Dog();
        animal.speak();
      }
      else if(choice == 2){
        animal = new Cat();
        animal.speak();
      }

      
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        car.go();
        bike.go();
        boat.go();

        Vehicle[] vehicles = {car, bike, boat};

        for(Vehicle vehicle : vehicles){
          vehicle.go();
        }

        Rabbit rabbit = new Rabbit();
        Fish fish = new Fish();
        Hawk hawk = new Hawk();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();

      Circle circle = new Circle(3);
      Rectangle rectangle = new Rectangle(5, 5);
      Triangle triangle = new Triangle(3, 4);

      System.out.println(circle.area());
      System.out.println(triangle.area());
      System.out.println(rectangle.area());
    }
}
