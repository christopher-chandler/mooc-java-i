
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {

        if (this.squares > compared.squares) {
        return true;}
        else {
            return  false;
        }
    }

    public int priceDifference(Apartment compared) {

        int comparisonApartment = compared.princePerSquare*compared.squares;
        int referenceApartment =  this.princePerSquare*this.squares;


        if (comparisonApartment > referenceApartment){
            return comparisonApartment - referenceApartment;
        } else {
            return referenceApartment - comparisonApartment;
        }



    }

    public boolean moreExpensiveThan(Apartment compared) {


        int comparisonApartment = compared.princePerSquare*compared.squares;
        int referenceApartment =  this.princePerSquare*this.squares;


        if (comparisonApartment < referenceApartment){
            return true;
        } else {
            return false;
        }

    }



}
