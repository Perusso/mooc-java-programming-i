
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("3");
        lista.add("-2");
        lista.add("5");
        lista.add("1");

        removeLast(lista);
        // Try your method in here
    }

    public static void removeLast(ArrayList<String> strings) {

        if (strings.size() == 0){
            return;
        }

        strings.remove(strings.size() - 1);
    }

}
