
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner leitor = new Scanner(Paths.get(file))) {

            while (leitor.hasNextLine()){

                String linha = leitor.nextLine();

                String[] parts = linha.split(",");
                String nome = parts[0];
                int age = Integer.valueOf(parts[1]);

                System.out.println(nome + ", age: " + age + " years");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
