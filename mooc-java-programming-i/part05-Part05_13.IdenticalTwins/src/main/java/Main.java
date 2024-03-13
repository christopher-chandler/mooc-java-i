
public class Main {

    public static void main(String[] args) {
        Person first = new Person("Leevi", new SimpleDate(1, 1, 2017), 70, 10);
        Person second = new Person("Leevi", new SimpleDate(1, 1, 2017), 70, 10);
        System.out.println(first.equals(second));
    }

}
