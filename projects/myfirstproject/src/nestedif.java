
import java.util.Scanner;

public class nestedif {
    public static void main(String[] args) {
        boolean isStudent;
        boolean isSenior;
        double price = 9.99;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Are you a student (true / false): ");
        isStudent = scanner.nextBoolean();

        System.out.print("Are you a Senior (true / false): ");
        isSenior = scanner.nextBoolean();

        if (isStudent) {
            if (isSenior) {
                System.out.println("You get a senior discount 20% ");
                System.out.println("You get a student discount 10% ");
                price *= 0.7;
            } else {
                System.out.println("You get a student discount 10% ");
                price *= 0.9;
            }
        } else {
            if (isSenior) {
                System.out.println("You get a senior discount 20% ");
                 price *= 0.8;
            } else {
                price *= 1;
            }
        }

        System.out.printf("The price of a ticket is %.2f", price);
        scanner.close();
    }
}
