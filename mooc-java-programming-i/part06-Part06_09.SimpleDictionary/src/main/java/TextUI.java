import java.util.Scanner;

public class TextUI {

    private SimpleDictionary dictionary = new SimpleDictionary();
    private Scanner scanner;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.dictionary = dictionary;
        this.scanner = scanner;

    }

    public void start() {


        boolean run = true;

        while (run) {
            System.out.print("Command:");
            String command = scanner.nextLine();

            System.out.println(command);

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                run = false;
            } else if (command.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);

            } else if (command.equals("search")){
                System.out.print("To be translated: ");
                String word = scanner.nextLine();

                if (dictionary.translate(word) == null){
                    System.out.println("Word "+word+" was not found");
                } else {
                    System.out.println(dictionary.translate(word));
                }
            }


            else {
                System.out.println("Unknown command");

            }

        }

    }
}