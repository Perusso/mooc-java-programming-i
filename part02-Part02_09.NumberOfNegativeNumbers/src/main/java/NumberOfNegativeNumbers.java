
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;

        while (true) {
            System.out.println("Give a number:");
            int numero = Integer.valueOf(scanner.nextLine());

            if (numero == 0) {
                break;
            }

            if (numero < 0) {
                contador++;
            }

        }

        System.out.println("Number of negative numbers: " + contador);

    }
}


