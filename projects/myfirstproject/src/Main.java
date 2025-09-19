
public class Main {

    public static void main(String[] args) {
        // System.out.println("I Love pizza");

        /*
         * steps to creating a variable
         * 1. declaration
         * 2. assignment
         */
        int age = 30;
        int year = 2025;
        int quantity = 1;

        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;


        String name = "Bro Code";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String color = "red";

        System.out.println("The year is "+ year);

        if(isStudent) {
        System.out.println("you are a student");
        } else {
        System.out.println("you are Not a student");

        }
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is: " + gpa);
        System.out.println("Your average letter grade is: " + grade);
        System.out.println("Your choice is a " + color + " "+ year +" "+ car);
        System.out.println("The price is "+ currency + price);
    }
}
