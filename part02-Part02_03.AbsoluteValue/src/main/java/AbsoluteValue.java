
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = Integer.valueOf(scanner.nextLine());

        if (numero < 0 ) {
            int menorQueZero = numero * -1;
            System.out.println(menorQueZero);
        } else {
            System.out.println(numero);
        }

    }
}
