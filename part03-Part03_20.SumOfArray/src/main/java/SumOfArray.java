
public class SumOfArray {

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        int soma = 0;

        for (int index = 0; index < array.length; index++) {
            soma = soma + array[index];
        }
        return soma;
    }
}

