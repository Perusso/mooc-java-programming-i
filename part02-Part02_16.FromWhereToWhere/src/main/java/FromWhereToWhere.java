
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        int numeroFim = scanner.nextInt();

        System.out.println("Where from?");
        int numeroInicio = scanner.nextInt();

        for (int i = numeroInicio; i <= numeroFim; i++) {
            System.out.println(i);
        }

    }
}
