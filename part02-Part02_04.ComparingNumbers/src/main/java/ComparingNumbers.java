
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1 = Integer.valueOf(scanner.nextLine());

        int numero2 = Integer.valueOf(scanner.nextLine());

        if (numero1 > numero2) {
            System.out.println(numero1 + " is greater than " + numero2);
        } else if (numero1 < numero2) {
            System.out.println(numero1 + " is smaller than " + numero2);
        } else {
            System.out.println(numero1 + " is equal to " + numero2);
        }

    }
}
