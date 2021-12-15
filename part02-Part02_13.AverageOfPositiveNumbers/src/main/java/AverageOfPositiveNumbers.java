
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        double quantidade = 0;

        while (true){

            double numeroInput = Double.valueOf(scanner.nextLine());

            if (numeroInput == 0) {

                if (quantidade == 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                } else {
                    System.out.println(soma/quantidade);
                }

                break;

            } else {

                if (numeroInput > 0) {
                    quantidade++;
                    soma += numeroInput;
                }

            }
        }

    }
}
