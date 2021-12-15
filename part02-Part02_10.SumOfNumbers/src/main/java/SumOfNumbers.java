
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaDosNumeros = 0;


        while (true) {
            System.out.println("Give a number:");
            int numero = Integer.valueOf(scanner.nextLine());

            if (numero == 0) {
                break;
            }

            if (numero != 0) {
                somaDosNumeros = somaDosNumeros + numero;
            }

        }
        System.out.println("Sum of the numbers: " + somaDosNumeros);

    }
}
