

public class FromParameterToOne {

    public static void main(String[] args) {

        printFromNumberToOne(3);

    }

    public static void printFromNumberToOne(int number) {

        int contador = number;

        while (contador >= 1) {
            System.out.println(contador);
            contador--;
        }
    }

}
