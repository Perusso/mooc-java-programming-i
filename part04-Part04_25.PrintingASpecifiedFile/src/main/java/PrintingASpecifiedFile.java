
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String input = scanner.nextLine();

        try {
            Scanner leitor = new Scanner(Paths.get(input));

            while (leitor.hasNextLine()) {

                String linha = leitor.nextLine();
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
