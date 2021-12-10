
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int numero = Integer.valueOf(scanner.nextLine());

            if (numero < 0) {
                System.out.println("Unsuitable number");
                continue;
            }
            if (numero == 0) {
                break;
            } else {
                System.out.println(numero * numero);
                continue;
            }
        }






    }
}
