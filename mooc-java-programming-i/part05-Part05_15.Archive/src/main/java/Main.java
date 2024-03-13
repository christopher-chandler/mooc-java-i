
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Archive> archive = new ArrayList<>();


        while (true) {

            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();

            if (identifier.equals("")){
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.equals("")){
                break;
            }

            Archive archivedItem = new Archive(name, identifier);



            if (archive.contains(archivedItem)){

            }
            else {
                archive.add(archivedItem);
            }

        }

        for (Archive item: archive) {
            System.out.println(item );

        }

    }
}
