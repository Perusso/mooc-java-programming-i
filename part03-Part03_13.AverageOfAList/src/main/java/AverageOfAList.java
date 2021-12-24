
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();

        while (true) {
            int numeroInput = scanner.nextInt();

            if (numeroInput == -1) {
                break;
            }
            lista.add(numeroInput);
        }

        System.out.println("");

        double soma = 0;
        double quantidadedeNumeros = lista.size();

        for (double numeros : lista) {
            soma = soma + numeros;
        }

        System.out.println("Average: " + soma/quantidadedeNumeros);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
