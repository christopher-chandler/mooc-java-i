
public class MainProgram {

    public static void main(String[] args) {
         Counter c = new Counter(900);
         c.decrease(-55);
         System.out.println(c.value());

        Counter ct = new Counter(5);
        ct.increase(-2);
        System.out.println(ct.value());
    }
}
