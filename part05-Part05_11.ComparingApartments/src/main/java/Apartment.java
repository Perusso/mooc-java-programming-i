
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        if (this.squares > compared.squares){
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared){
        int apPrice = this.squares * this.princePerSquare;
        int comparedPrice = compared.squares * compared.princePerSquare;
        return Math.abs(apPrice - comparedPrice);
    }

    public int totalPrice(){
        return this.princePerSquare * this.squares;
    }

    public boolean moreExpensiveThan(Apartment compared){
        if (this.totalPrice() > compared.totalPrice()) {
            return true;
        } else {
            return false;
        }
    }










}
