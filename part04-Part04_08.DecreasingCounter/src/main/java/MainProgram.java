
public class MainProgram {

    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();
        counter.decrement();
        counter.decrement();
        counter.printValue();
        counter.reset();
        counter.printValue();

        DecreasingCounter counter2 = new DecreasingCounter(1);
        counter2.printValue();
        counter2.decrement();
        counter2.printValue();
        counter2.decrement();
        counter2.printValue();
    }
}
