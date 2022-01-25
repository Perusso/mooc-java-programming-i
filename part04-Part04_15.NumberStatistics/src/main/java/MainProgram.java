
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics statistics1 = new Statistics();// objeto para guardar soma
        Statistics statistics2 = new Statistics(); // objeto para guardar pares
        Statistics statistics3 = new Statistics(); // objeto para guardar pares

        System.out.println("Enter numbers: ");
        while (true) {
            int numeros = Integer.parseInt(scanner.nextLine());

            if (numeros == -1) {
                System.out.println("Sum: " + statistics1.sum());
                System.out.println("Sum of even numbers: " + statistics2.sum());
                System.out.println("Sum of odd numbers: " + statistics3.sum());
                break;
            } else {
                statistics1.addNumber(numeros);

                if (numeros % 2 == 0) {
                    statistics2.addNumber(numeros);
                } else {
                    statistics3.addNumber(numeros);
                }
            }
        }
    }
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
}
