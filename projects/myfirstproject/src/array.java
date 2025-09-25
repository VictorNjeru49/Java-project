
import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int size;

        System.out.print("What # of food do you want ?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for(int i = 0; i < foods.length; i++){
            System.out.println("Enter a food:");
            foods[i] = scanner.nextLine();
        }

        for(String food: foods){
            System.out.println(food);
        }
        // String[] fruits = {"apple", "orange", "banana", "coconut"};

        // System.out.print("Enter the fruit to be searched: ");
        // String target = scanner.nextLine();

        // for(int i = 0; i < fruits.length; i++){
        //     System.out.println(fruits[i]);
        // }
        // Arrays.sort(fruits);
        // for(String fruit: fruits){
        //     System.out.println(fruit);
        // }


        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        int target = 7;
        boolean isFound = false;

        for(int i = 0; i < numbers. length; i++){
        if(target == numbers[i]){     // if(fruits[i].equals(target))   -> string
        System.out.println("Element found at index: " + i);
        isFound = true;
        break;
        }
    }
    if(!isFound){
        System.out.println("Element not found in the array!");
    }
        scanner.close();
    }
}
