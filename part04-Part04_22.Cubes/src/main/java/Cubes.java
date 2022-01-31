
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String stringInput = scanner.nextLine();

            if (stringInput.equals("end")) {
                break;
            }

            int number = Integer.valueOf(stringInput);
            number = number * number * number;
            System.out.println(number);
        }

    }
}
