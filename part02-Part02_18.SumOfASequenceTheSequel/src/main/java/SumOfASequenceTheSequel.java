
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        int numeroInicio = scanner.nextInt();

        System.out.println("Last number?");
        int numeroFim = scanner.nextInt();

        int soma = 0;

        for (int i = numeroInicio; i <= numeroFim; i++) {
            soma += i;
        }
        System.out.println("The sum is " + soma);

    }
}
