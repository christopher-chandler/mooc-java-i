
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    private double returnChange(double payment,double mealType){
        if (payment >= mealType){
            money+=mealType;

            if (mealType == 2.50){
            affordableMeals++;}
            if (mealType == 4.3) {
                heartyMeals++;
            }

            return payment-mealType;
        } else {
            return payment;
        }
    }
    public void addMoneyToCard(PaymentCard card, double sum) {

        if (sum > 0) {
        money = money+sum;
        card.addMoney(sum);
    }
    }

    public PaymentTerminal( ) {
         money = 1000;
    }

    public double eatAffordably(double payment) {

        return returnChange(payment,2.50);
    }

    public boolean eatAffordably(PaymentCard paymentcard) {

        if (paymentcard.balance() >= 2.50) {
            paymentcard.takeMoney(2.50);
            affordableMeals++;
            return true;
        } else {
            return  false;
        }
    }

    public double eatHeartily(double payment) {

        return returnChange(payment,4.3);
    }

    public boolean eatHeartily(PaymentCard paymentcard) {


        if (paymentcard.balance() >= 4.30) {
            heartyMeals++;
            paymentcard.takeMoney(4.30);
            return true;
        } else {
            return  false;
        }


    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
