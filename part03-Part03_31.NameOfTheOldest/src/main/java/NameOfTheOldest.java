
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maiorIdade = 0;
        String nomeDoMaior = "";

        while (true) {

            String texto = scanner.nextLine();

            if (texto.isEmpty()) {
                break;
            }

            String[] partesDoTexto = texto.split(",");

            int idade = Integer.valueOf(partesDoTexto[1]);
            String nome = partesDoTexto[0];

            if (idade > maiorIdade) {
                maiorIdade = idade;
                nomeDoMaior = nome;
            }
        }
        System.out.println("Name of the oldest: " + nomeDoMaior);
    }
}
