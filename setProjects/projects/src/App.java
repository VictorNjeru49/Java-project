public class App {
    public static void main(String[] args){

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
