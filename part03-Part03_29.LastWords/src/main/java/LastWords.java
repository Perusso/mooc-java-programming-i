
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String textoDoUsuario = scanner.nextLine();

            if (textoDoUsuario.equals("")){
                break;
            }

            String[] palavrasDoTexto = textoDoUsuario.split(" ");

            System.out.println(palavrasDoTexto[palavrasDoTexto.length - 1]);
        }


    }
}
