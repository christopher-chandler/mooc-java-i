
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money addition) {


        Money newMoney = new Money(this.euros+addition.euros , this.cents+addition.cents);

        return newMoney;


    }

    public boolean lessThan(Money compared) {
        double hundreds = 0.1;
        double comparedCents = compared.cents*hundreds;
        double thisCents = this.cents*hundreds;

        double comparedAmount = compared.euros+comparedCents;
        double thisAmount = this.euros+thisCents;

        System.out.println(comparedAmount);

        return thisAmount < comparedAmount ;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
