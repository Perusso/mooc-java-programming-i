public class Timer {

    private ClockHand hundreds;
    private ClockHand seconds;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundreds = new ClockHand(100);
    }

    public void advance() {
        this.hundreds.advance();

        if (this.hundreds.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return seconds + ":" + hundreds;
    }
}
