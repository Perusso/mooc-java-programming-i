
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        int sum = (first + second);
        System.out.println(first + " + " + second + " = " + sum);

        int sub = first - second;
        System.out.println(first + " - " + second + " = " + sub);

        int mult = first * second;
        System.out.println(first + " * " + second + " = " + mult);

        double doubleFirst = Double.valueOf(first);
        double doubleSecond = Double.valueOf(second);

        double division = doubleFirst / doubleSecond;
        System.out.println(first + " / " + second + " = " + division);


        // Write your program here

    }
}
