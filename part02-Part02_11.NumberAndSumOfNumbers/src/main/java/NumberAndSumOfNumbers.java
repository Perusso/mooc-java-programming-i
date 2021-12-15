
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int soma = 0;

        while (true) {
            System.out.println("Give a number:");
            int numero = Integer.valueOf(scanner.nextLine());

            if (numero == 0) {
                break;
            }

            if (numero != 0) {
                contador++;
                soma = soma + numero;
            }

        }

        System.out.println("Number of numbers: " + contador);
        System.out.println("Sum of the numbers: " + soma);

    }
}
