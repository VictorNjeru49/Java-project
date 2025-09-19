import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double width = 0;
        double height = 0;
        double area = 0;
        
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter your name:");
       String name = scanner.nextLine();

        System.out.print("Enter your age:");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello" + name);
        System.out.println("You are" + age + " years old");
        System.out.println("Your gpa is: " + gpa);
        System.out.println("Student: " + isStudent);

       
       scanner.close();

    }
}
