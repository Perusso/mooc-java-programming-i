
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String texto = scanner.nextLine();
            String[] palavrasDoTexto = texto.split(" ");

            for (String palavra : palavrasDoTexto) {
                System.out.println(palavra);
            }
            if (texto.equals("")) {
                break;
            }
        }
    }
}
