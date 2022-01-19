
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maiorIdade = 0;

        while (true) {

            String texto = scanner.nextLine();
            if (texto.equals("")){
                break;
            }

            String[] elementos = texto.split(",");
            int idade = Integer.valueOf(elementos[1]);
            if (idade > maiorIdade){
                maiorIdade = idade;
            }
        }

        System.out.println("Age of the oldest: " + maiorIdade);
    }
}
