import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Name: ");
            String tituloInput = scanner.nextLine();

            if (tituloInput.isEmpty()) {
                break;
            }

            System.out.println("Duration: ");
            int duracaoInput = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(tituloInput, duracaoInput));
        }

        System.out.println("Program's maximum duration?");
        int maxDuracao = scanner.nextInt();

        for (TelevisionProgram filmes : programs) {

            if (filmes.getDuration() <= maxDuracao) {
                System.out.println(filmes);
            }
        }
    }
}
