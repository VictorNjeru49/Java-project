
import java.util.Random;
import java.util.Scanner;

public class slotmachine {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // JAVA SLOT MACHINE
        // DECLARE VARIABLES
        // DISPLAY WELCOME MESSAGE
        // PLAY IF BALANCE > 0
        // ENTER BET AMOUNT
            // VERIFY IF BET > BALANCE
            // VERIFY IF BET > 0
            // SUBTRACT BET FROM BALANCE
        // SPIN ROW
        // PRINT ROW
        // GET PAYOUT
        // ASK TO, PLAY AGAIN
        // DISPLAY EXIT MESSAGE

         int balance = 100;
         int bet = 0;
         int payout;
         String[] row;
         String playAgain;



        System.out.println(" **************************");
        System.out.println(" Welcome to Java Slots ");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐ ");
        System.out.println(" ***************************");

    if(balance <= 0) {
        double amount = deposit();
        balance += amount;
    }

    while (true) {
        if (balance <= 0) {
            System.out.println("You have no balance left. Exiting game.");
            break;
        }

        System.out.println("Current balance: $" + balance);
        System.out.print("Place your bet amount: ");
        bet = scanner.nextInt();
        scanner.nextLine();

        if (bet > balance) {
            System.out.println("INSUFFICIENT FUNDS");
            continue;
        } else if (bet <= 0) {
            System.out.println("Bet must be greater than 0");
            continue;
        } else {
            balance -= bet;
            System.out.println("$" + balance);
        }

        System.out.println("You current balance is: " + balance);

        System.out.println(" **************************");
        System.out.println("    Spinning.............. ");
        row = spinRow();
        printRow(row);
        payout = getPayout(row, bet);

        if (payout > 0) {
            System.out.println("you have won $" + payout);
            balance += payout;
        } else {
            System.out.println("sorry you lost this round!");
        }
        System.out.println(" **************************");

        System.out.print("Do you want to play again? (Y/N): ");
        playAgain = scanner.nextLine().toUpperCase();

        if (!playAgain.equals("Y")) {
            break;
        }
    }

    System.out.println("Game over you balance is $"+ balance);
    scanner.close();
}
    static double deposit(){
        double amount;

        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount cannot be negative\n");
            return 0;
        }
        else{
            System.out.printf("You have deposited $%.2f\n", amount);
            return amount;
        }
    }
    static String[] spinRow(){

        String[] symbols = {"🍒" ,"🍉" ,"🍋" ,"🔔" ,"⭐"};
        String[] row = new String[3];
        Random random = new Random();

        for(int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    static void printRow(String[] row){
        System.out.println(" **************************");
        System.out.println(" "+ String.join(" | ", row));
        System.out.println(" **************************");
    }

    static int getPayout(String[] row, int bet){

        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        }
        else if(row[0].equals(row[1])){
            return switch(row[0]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        else if(row[1].equals(row[2])){
            return switch(row[1]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    }

}
