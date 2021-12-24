
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();

        while(true){
            int numeroInput = scanner.nextInt();

            if (numeroInput == 9999){
                break;
            }

            lista.add(numeroInput);
        }

        int menorNumeroDaLista = lista.get(0);

        for (int i = 0; i < lista.size(); i++){
            int numeroDaLista = lista.get(i);

            if (numeroDaLista < menorNumeroDaLista){
                menorNumeroDaLista = numeroDaLista;
            }
        }
        System.out.println("Smallest number: " + menorNumeroDaLista);

        for (int i = 0; i < lista.size(); i++) {
            int numeroDaLista = lista.get(i);

            if (numeroDaLista == menorNumeroDaLista){
                System.out.println("Found at index: " + i);
            }

        }
        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
    }
}
