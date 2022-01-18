
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username:");
        String user = scanner.nextLine();

        System.out.println("Enter password:");
        String senha = scanner.nextLine();

        String[] usuarios = {"alex", "emma"};
        String[] senhas = {"sunshine", "haskell"};

        if (user.equals(usuarios[0]) && senha.equals(senhas[0])){
            System.out.println("You have successfully logged in!");
        } else if (user.equals(usuarios[1]) && senha.equals(senhas[1])) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }


    }
}
