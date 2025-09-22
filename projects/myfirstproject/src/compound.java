
import java.util.Scanner;

public class compound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timecompounded;
        int years;
        double amount;

        System.out.print("Enter the principal?: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the rate?: ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the time year compound?: ");
        timecompounded = scanner.nextInt();

        System.out.print("Enter the # of years?: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate/ timecompounded, timecompounded * years);

        System.out.printf("The amount after %d years is $%.2f", years, amount );

        scanner.close();
    }
}
