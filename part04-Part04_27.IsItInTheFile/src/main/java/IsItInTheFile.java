
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try ( Scanner leitor = new Scanner(Paths.get(file))) {

            while (true) {

                String linha = leitor.nextLine();
                if (linha.contains(searchedFor)) {
                    System.out.println("Found!");
                    break;
                }

                if (!leitor.hasNextLine()) {
                    System.out.println("Not found.");
                    break;
                }

            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
