public class App {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        dog.eat();
        dog.speak();
        cat.eat();
        cat.speak();
        plant.photosynthesize();

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");

        System.out.println(Friend.numoffriends);
        Friend.showfriend();

        Car car = new Car();
        car.start();
        car.drive();
        car.brake();
        car.stop();

        Vehicle vehicle1 = new Vehicle("Mustang", "Red");
        Vehicle vehicle2 = new Vehicle("Corvette", "Blue");
        Vehicle vehicle3 = new Vehicle("Charger", "Yellow");
        
        // Vehicle[] vehicles = {vehicle1, vehicle2, vehicle3};
        
        Vehicle[] vehicles = {new Vehicle("Mustang", "Red"),
                              new Vehicle("Corvette", "Blue"),
                              new Vehicle("Charger", "Yellow")};

        for(int i = 0; i < vehicles.length; i++){
            vehicles[i].drive();
        }
        
        for(Vehicle vehicle: vehicles){
            vehicle.drive();
        }

        Student student1 = new Student("spongebob", 23, 3.3);
        Student student2 = new Student("patrick", 29, 2.5);

        System.out.println(student1.name +" "+ student1.age +" "+ student1.gpa +" "+ student1.isEnrolled);
        student1.study();
        System.out.println(student2.name +" "+ student2.age +" "+ student2.gpa +" "+ student2.isEnrolled);
        student2.study();


        User user1 = new User("Spongebob");
        User user2 = new User("Patrick", "PStar@aol.com");
        User user3 = new User("Sandy", "SCheeks@gmail.com", 27);
        User user4 = new User();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
    }
}
