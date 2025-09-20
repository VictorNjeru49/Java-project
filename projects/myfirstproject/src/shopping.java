
import java.util.Scanner;

public class shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        quantity= scanner.nextInt();

        total = price * quantity;

        System.out.println("\n You have bought " + quantity + " " + item );
        System.out.printf("Your total is %s %.2f", currency, total);
        scanner.close();
    }
}
