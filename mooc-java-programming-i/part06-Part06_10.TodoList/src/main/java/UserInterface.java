import java.util.Scanner;

public class UserInterface {

    private TodoList list = new TodoList();
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.list = todoList;
        this.scanner = scanner;
    }

    public void start() {


        while (true){

            System.out.print("Command:");
            String command = scanner.nextLine();

            if (command.equals("add")){
                System.out.print("to add:");
                String toAdd = scanner.nextLine();
                list.add(toAdd);
            }
            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                list.print();
            }
            if (command.equals("remove")) {
                System.out.print("Which one is removed?");
                int number = scanner.nextInt();
                list.remove(number);
            }
        }


    }


}
