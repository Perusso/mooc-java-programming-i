
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(1);
        numbers.add(7);
        numbers.add(9);
        numbers.add(4);

        printNumbersInRange(numbers, 2, 9);
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){

        for (int numero : numbers){

            if (numero >= lowerLimit && numero <= upperLimit){
                System.out.println(numero);
            }
        }

    }
    
}
