
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        printStars(6);
        printStars(9);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        printSquare(6);
        System.out.println("\n---");
        printRectangle(5, 6);
        printRectangle(12,3);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int contador = 0;
        while (contador < number) {
            System.out.print("*");
            contador++;
        }
        System.out.print("\n");
        // first part of the exercise
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++ ) {
            printStars(size);
        }
        System.out.print("\n");
        // second part of the exercise
    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++){
            printStars(width);
        }
        System.out.print("\n");
        // third part of the exercise
    }

    public static void printTriangle(int size) {
        for (int i = 0; i <= size; i++){
            printStars(i);
        }
        // fourth part of the exercise
    }
}
