
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(2);
        lista.add(5);
        lista.add(7);
        lista.add(3);

        sum(lista);
        // Try your method here
    }


    public static int sum(ArrayList<Integer> numbers) {


        int soma = 0;
        for (int i = 0; i < numbers.size(); i++) {

            int numero = numbers.get(i);
            soma = soma + numero;

        }
        System.out.println(soma);
        return soma;
    }
}
