
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a word: ");

        String palavra = scanner.nextLine();

        for (int i = 0; i < 3; i++){
            System.out.print(palavra);
        }


        // Write your program here

    }
}
