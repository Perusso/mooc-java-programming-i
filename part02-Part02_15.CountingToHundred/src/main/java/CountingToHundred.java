
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroInput = scanner.nextInt();

        for (int i = numeroInput; i <= 100; i++) {
            System.out.println(i);
        }

    }
}
