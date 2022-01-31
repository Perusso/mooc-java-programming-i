
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int contador = 0;

        try ( Scanner leitor = new Scanner(Paths.get(file))) {

            while (true) {

                int numeros = Integer.valueOf(leitor.nextLine());

                if (numeros <= upperBound && numeros >= lowerBound) {
                    contador++;
                }

                if (!leitor.hasNextLine()) {
                    break;
                }
        }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Numbers: " + contador);
    }
}
