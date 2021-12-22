
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");

        int numero = scanner.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero; i++){
            fatorial = fatorial * i;
        }
        System.out.println("Factorial: " + fatorial);
    }
}
