
import java.util.Scanner;

public class loops {
    public static void main(String[] args) throws InterruptedException{

        String name = "";
        String response = "";
        int age;
        int number;

        Scanner scanner = new Scanner(System.in);

        // While loop
        
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while (name.isEmpty()) {
            System.out.print("Enter the name: ");
            name = scanner.nextLine(); 
        }

        while(!response.equals("Q")){
            System.out.println("You are playing a game!");
            System.err.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }

        while(age < 0) {
            System.out.println("Your age cannot be a negative number!");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();

        }


        System.out.printf("Hello %s", name);
        System.out.println("You have quit the game!");
        System.out.printf("You are %d years old", age);


        //Do while loop

        do{
            System.out.print("Enter a number between 1 to 10: ");
            number = scanner.nextInt();
        }while(number < 0 || number >= 10);
        
        System.out.printf("You picked %d", number);


        // For Loop

        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for(int i = 1; i <= max; i++){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("Happy New Year!");

        
        // break break out of a loop (STOP)
        // continuel skip current iteration of a loop (SKIP)
        for(int j= 8; j < 10; j++){
            if(j == 5){
            continue;
            }
        System.out.print(j +" ");
        }


        //Nested loops

        for(int y = 1; y < 3; y++) {

            for(int z = 1; z < 10; z++){

                System.out.println("z");
            }
        }


        System.out.print("Enter the amount of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the amount of columns: ");
        int columns = scanner.nextInt();

        System.out.print("Enter the amount of symbols: ");
        char symbol = scanner.next().charAt(0);

        for(int a = 0; a < rows; a++){
            for(int b = 0; b < columns; b++){
                System.out.print(symbol);
            }
            System.out.println();
        }
        scanner.close();
    }
}
