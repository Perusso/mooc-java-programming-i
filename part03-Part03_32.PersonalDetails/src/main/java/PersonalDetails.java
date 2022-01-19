
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int soma = 0;
        String nomeMaior = "";

        while (true) {

            String texto = scanner.nextLine();

            if (texto.isEmpty()) {
                break;
            }

            String[] partesDoTexto = texto.split(",");

            String nome = partesDoTexto[0];
            int dataDeNascimento = Integer.valueOf(partesDoTexto[1]);


            if (nome.length() > nomeMaior.length()) {
                nomeMaior = nome;
            }

            soma = soma + dataDeNascimento;
            contador++;
        }

        System.out.println("Longest name: " + nomeMaior);

        System.out.println("Average of the birth years: " + (1.0 * soma/contador));
    }
}
