
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {

        for (int numero : array) {

            int ultimoDaLista = array[array.length - 1];
            if (numero == ultimoDaLista) {
                System.out.print(numero);
                break;
            }
            System.out.print(numero + ", ");
        }
        // Write some code in here
    }
}
