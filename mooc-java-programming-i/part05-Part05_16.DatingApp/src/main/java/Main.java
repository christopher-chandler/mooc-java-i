
public class Main {

    public static void main(String[] args) {

        SimpleDate date = new SimpleDate(26,12,2011);
        SimpleDate newDate = date.afterNumberOfDays(350);

        //date.advance(5);
        System.out.println(date);
        System.out.println(newDate);





    }
}
