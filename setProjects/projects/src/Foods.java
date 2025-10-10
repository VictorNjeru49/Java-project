import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Foods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> food = new ArrayList<>();

        System.out.print("Enter the # number of foods: ");
        int numofFood = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numofFood; i++) {
            System.out.printf("The food for # %d: ", i);
            String foods = scanner.nextLine();
            food.add(foods);
        }
        Collections.sort(food);
        System.out.println(food);
        
        scanner.close();

    }

}
