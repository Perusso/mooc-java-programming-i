
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something:");
        boolean isTrue = Boolean.valueOf(scanner.nextLine());
        System.out.println("True or false? " + isTrue);

        // write your program here

    }
}
