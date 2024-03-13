
import java.util.*;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        HashMap<String, Bird> birdList = new HashMap<String, Bird>();

        while (true) {

            System.out.print("? ");
            String command = scan.nextLine();

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String LatinName = scan.nextLine();

                Bird newBird = new Bird(name, LatinName);
                birdList.put(name, newBird);

            }

            else if (command.equals("Observation")){
                System.out.print("Bird? ");
                String name = scan.nextLine();
                if (birdList.containsKey(name)){
                    Bird bird = birdList.get(name);
                    bird.increaseObservations();
                }
            }


            else if (command.equals("All")){
                for(Map.Entry<String, Bird> b: birdList.entrySet()) {
                    System.out.println(b.getValue());
                }
            }

            else if (command.equals("One")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                Bird b = birdList.get(name);
                System.out.println(b );
            }

            if (command.equals("Quit")){
                break;
            }
        }
    }
}
