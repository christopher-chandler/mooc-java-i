import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private JokeManager manager;


public UserInterface(JokeManager manager, Scanner scanner){
    this.scanner = scanner;
    this.manager = manager;
}
    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");

            String command = scanner.nextLine();

            if (command.equals("X")) {
                break;
            }

            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke =  scanner.nextLine();
                manager.addJoke(joke);
            } else if (command.equals("2")) {
                System.out.println("Drawing a joke.");

                if (manager.returnJokes().isEmpty()) {
                    System.out.println("Jokes are in short supply.");
                } else {
                    Random draw = new Random();
                    int index = draw.nextInt(manager.returnJokes().size());
                    System.out.println(manager.returnJokes().get(index));
                }

            } else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                for (String joke : manager.returnJokes()) {
                    System.out.println(joke);
                }
            }
        }
    }

}


