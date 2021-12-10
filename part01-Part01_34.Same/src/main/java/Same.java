
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first string:");

        String primeiraString = scan.nextLine();

        System.out.println("Enter the second string:");
        String segundaString = scan.nextLine();

        if (primeiraString.equals(segundaString)){
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

        // Write your program here. 
    }
}
