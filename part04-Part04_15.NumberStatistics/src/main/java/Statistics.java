
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
        // initialize the variable numberCount here
    }

    public void addNumber(int number) {
        count++;
        this.sum = sum + number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        double media = 0;

        if (this.sum() != 0 && this.count != 0) {
            media = 1.0 * this.sum / this.count;
        }
        return media;
    }
}
