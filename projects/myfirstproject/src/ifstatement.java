
import java.util.Scanner;

public class ifstatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        double height;
        boolean isStudent;


        System.out.print("Enter your name: ");
        name= scanner.nextLine();
        
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Enter the height?: ");
        height = scanner.nextDouble();
        
        System.out.print("Are you a Student (true / false): ");
        isStudent = scanner.nextBoolean();



        //Group 1
        if(name.isEmpty()) {
        System.out.println("You didn't enter your name: ");
        }
        else{
        System.out.printf("Hello %s! ",name);
        }


        //Group 4
        System.out.printf("You are %f inches tall\n", height);


        //Group 2
        if(age >= 65) {
        System.out.println("You are a senior");
        }
        else if(age >= 18){
        System.out.println("You are an adult!");
        }
        else if(age < 0){
        System.out.println("You haven't been born yet!");
        }
        else if(age == 0){
        System.out.println("You are a baby!");
        }
        else{
        System.out.println("You are a child!");
        }  

        //Group 3
        if(isStudent){
            System.out.println("You are a good student");
        } else {
            System.out.println("You are not a student");
        }


        System.out.printf("%s is %d years old", name, age);
        scanner.close();
}
    }
