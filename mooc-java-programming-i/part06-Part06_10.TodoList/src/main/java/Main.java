
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);

        UserInterface program = new UserInterface(list, scanner);
        program.start();

    }
}
