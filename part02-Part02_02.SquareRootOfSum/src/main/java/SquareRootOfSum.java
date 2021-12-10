
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroUm = Integer.valueOf(scanner.nextLine());

        int numeroDois = Integer.valueOf(scanner.nextLine());

        int soma = numeroDois + numeroUm;

        double raiz = Math.sqrt(soma);

        System.out.println(raiz);

    }
}
