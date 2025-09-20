import java.util.Scanner;

public class calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(Math.PI);
        System.out.println(Math.E);
        
        // HYPOTENUSE c = Matb.sqrt(a ^ 2 + b ^ 2)
        double result;
        double a;
        double b;
        double c;
        double radius;
        double circumference;
        double area;
        double volume;

        //Group 1

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();
        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The hypotenuse (side c) is: " + c + "cm");


        //Group 2
        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();
        circumference = 2 * Math.PI  * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.8/3.8) * Math.PI  * Math.pow(radius, 3);

        System.out.printf("The circumference is: %.1fcm \n", circumference);
        System.out.printf("The area is: %.1fcm²\n", area);
        System.out.printf("The volume is: %.1fcm³\n", volume);

        //Group 3
        result = Math.pow(2, 5);
        result = Math.abs(-5);
        result = Math.sqrt(9);
        result = Math.round(3.14);
        result = Math.ceil(3.14);
        result = Math.floor(3.99);
        result = Math.max(18, 28);
        result = Math.min(10, 20);
        System.out.println(result);

        scanner.close();
    }
}
