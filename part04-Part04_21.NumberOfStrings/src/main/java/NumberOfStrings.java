
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> frasesInput = new ArrayList<>();
        int contador = 0;

        while (true) {

            String input = scanner.nextLine();

            if (input.contains("end")){
                break;
            }
            frasesInput.add(input);
            contador++;
        }
        System.out.println(contador);
    }
}
