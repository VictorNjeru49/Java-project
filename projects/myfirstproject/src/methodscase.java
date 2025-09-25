
import java.util.Scanner;

public class methodscase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        happyBirthday(name, age);
        square(3);
        cube(5);
        String fullname = getFullName("Spongebob", "Squarepants");
        System.out.println(fullname);

        if(checkAge(age)){
            System.out.println("You can signup");
        }
        else {
            System.out.println("You are a child, cannot signup");
        }
        scanner.close();
    }

    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
}
    static double square (double number) { return number * number; }
    static double cube (double number) { return number * number * number; }
    static String getFullName(String first, String last) {
        return first +" "+ last;
    }
    static boolean checkAge(int age){
        return age > 18;
    }

}
