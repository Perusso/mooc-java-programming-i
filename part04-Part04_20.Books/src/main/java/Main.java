import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them

        Scanner scanner = new Scanner(System.in);
        List<Book> livros = new ArrayList<>();

        while (true) {

            System.out.println("Title:");
            String titulo = scanner.nextLine();

            if (titulo.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int paginas = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year: ");
            int anoDeLancamento = Integer.valueOf(scanner.nextLine());

            livros.add(new Book(titulo, paginas, anoDeLancamento));
        }

        System.out.println("");
        System.out.println("What information will be printed? ");

        String informacaoDesejada = scanner.nextLine();

        for (Book livro : livros) {
            if (informacaoDesejada.contains("everything")){
                System.out.println(livro);
            } else if (informacaoDesejada.contains("name")) {
                System.out.println(livro.getTitle());
            }
        }

        }
}
