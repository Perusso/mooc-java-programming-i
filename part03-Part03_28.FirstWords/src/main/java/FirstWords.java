
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String textoInput = scanner.nextLine();
            if (textoInput.equals("")){
                break;
            }
            String[] palavrasDoTexto = textoInput.split(" ");
            System.out.println(palavrasDoTexto[0]);
        }
    }
}
