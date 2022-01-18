
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String textoDoUsuario = scanner.nextLine();

            String[] palavrasDoTexto = textoDoUsuario.split(" ");

            for (String palavra : palavrasDoTexto) {
                if (palavra.contains("av")){
                    System.out.println(palavra);
                }
            }
            if (textoDoUsuario.equals("")) {
                break;
            }
        }
    }
}
