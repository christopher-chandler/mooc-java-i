
import java.util.ArrayList;

public class NullPointerExceptionProgram {

    public static void main(String[] args) {
        Person person = new Person("tom");

        person.changeName("eric");

        person = null;


        person.changeName("hey");



    }
}
