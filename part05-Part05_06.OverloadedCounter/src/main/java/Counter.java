public class Counter {

    private int value;

    public Counter(){
        this.value = 0;
    }

    public Counter(int startValue){
        this.value = startValue;
    }

    public int value(){
        return this.value;
    }

    public void increase(){
        this.value = value +1;
    }

    public void increase(int increaseBy){
        if (increaseBy < 0){
            value();
        } else {
            this.value = value + increaseBy;
        }
    }

    public void decrease(){
        this.value = value -1;
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy < 0) {
            value();
        } else {
            this.value = value - decreaseBy;
        }
    }
}
