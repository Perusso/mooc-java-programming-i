
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?");

        int numeroFim = scanner.nextInt();
        int soma = 0;

        for (int i = soma; i <= numeroFim; i++) {
            soma += i;
        }
        System.out.println("The sum is " + soma);
    }
}
