
import java.util.Random;

public class randomset {
public static void main(String[] args) {
    Random random = new Random();
    int number;
    double pi;
    boolean isHead;

    number = random.nextInt(1, 7);
    pi = random.nextDouble();
    isHead = random.nextBoolean();

    if (isHead) {
        System.out.println("The output is heads");
    } else {
        System.out.println("The output is tails");
    }

    System.out.println(number);
    System.out.println(pi);
}
}
