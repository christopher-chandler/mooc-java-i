
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void advance(){
        int monthCounter = 0;
        boolean notFullMonth = this.day <=29;
        boolean fullMonth = this.day == 30;

        boolean notFullYear = this.month <=11;
        boolean fullYear = this.month == 12;

        if (notFullMonth){
            this.day++;
        } else if (fullMonth) {
            this.day = 1;
            monthCounter++;
        }

        if (notFullYear) {
            month += monthCounter;
        } else if (fullYear && fullMonth) {
            this.month = 1;
            this.year++;
        }


    }
    public void advance(int howManyDays) {

        for (int i=0; i < howManyDays; i++) {
            this.advance();
        }


    }

    public SimpleDate afterNumberOfDays(int days) {

        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return  newDate;
    }


    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
