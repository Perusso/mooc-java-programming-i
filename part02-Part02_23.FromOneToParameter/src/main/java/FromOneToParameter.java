

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(3);
    }

    public static void printUntilNumber(int number) {
        int contador = 1;
        while (contador <= number) {
            System.out.println(contador);
            contador++;
        }
    }

}
