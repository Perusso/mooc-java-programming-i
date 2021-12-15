
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        double quantidade = 0;

        while (true) {
            System.out.println("Give a number:");
            double numero = Integer.valueOf(scanner.nextLine());

            if (numero == 0) {
                break;
            }

            if (numero != 0) {
                soma = soma + numero;
                quantidade++;
            }

        }

        System.out.println("Average of the numbers: " + soma/quantidade);

    }
}
