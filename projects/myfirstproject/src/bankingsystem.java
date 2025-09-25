
import java.util.Scanner;

public class bankingsystem {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //JAVA BANKING PROGRAM FOR BEGINNERS

       
        // DECLARE VARIABLES

        double balance = 0;
        boolean isRunning = true;
        int choice;


        // DISPLAY MENU
        while(isRunning){
        System.out.println("*************************");
        System.out.println(" BANKING SYSTEM ");
        System.out.println("**************************");
        System.out.println("1. Show balance");
        System.out.println("2. Deposit");
        System.out.println("2. Withdrawal");
        System.out.println("2. Exit");
        System.out.println("*************************");
        
        // GET AND PROCESS USERS CHOICE
        System.out.print("Enter the choice (1-4): ");
        choice = scanner.nextInt();

        switch (choice) {
               // showBalance()
            case 1 -> showBalance(balance);

                 // deposit()
            case 2 -> balance +=deposit();

                // withdraw()
            case 3 -> balance -=withdrawal(balance);

                // EXIT MESSAGE
            case 4 -> isRunning = false;

            default -> System.out.println("Invalid choice, Please try again later");
        }
}
        System.out.println(" ******************************");
        System.out.println("Thank you! Have a nice day!");
        System. out.println(" ******************************");  


        scanner.close();
    }
    static void showBalance(double balance){
        System.out.printf("%.2f\n", balance);
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
    static double withdrawal(double balance){
        double amount;

        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble() ;

        if(amount > balance){
        System.out.println("INSUFFICIENT FUNDS\n");
        return 0;
        }
        else if(amount < 0){
        System.out.println("Amount can't be negative\n");
        return 0;
        }
        else{
        System.out.printf("You have withdrawal $%.2f\n", amount);
        return amount;

    }
}
}