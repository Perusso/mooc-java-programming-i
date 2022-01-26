public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance){
        this.balance = openingBalance;
    }

    public String toString(){
        return "The card has a balance of " +  this.balance +  " euros";
    }

    public void eatAffordably() {
        if (this.balance < 2.60) {
            this.balance = balance;
        } else {
            this.balance = balance - 2.60;
        }
        // write code here
    }

    public void eatHeartily() {
        if (this.balance < 4.60) {
            this.balance = balance;
        } else {
            this.balance = balance - 4.60;
        }
        // write code here
    }

    public void addMoney(double amount) {

        if (amount < 0) {
            this.balance = balance;

        } else {
            if (this.balance + amount > 150.0){
                this.balance = 150.0;
            } else {
                this.balance = balance + amount;
            }
        }
    }
}
