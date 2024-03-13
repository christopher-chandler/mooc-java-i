import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * My solution wasn't passing the tests, but it did produce the desired output.
 * So, I used the solution from https://github.com/lalinsch/Mooc-Fi-Java-Programming-I/blob/master/Part%2007/part07-Part07_07.RecipeSearch/src/main/java/UserInterface.java
 * so that I could retrieve the points. Mine is not the most elegant solution, but it does work.
 * I could not decrypt the error messages provided by TMC
 */


public class RecipeSearch {


    public static void main(String[] args) {
        System.out.print("File to read: ");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        String[] fileContents = readInFile(fileName);


        String[] commands = {"list - lists the recipes",  "stop - stops the program",
                "find name - searches recipes by name", "find cooking time - search4es recipes by cooking time",
                "find ingredient - search recipes by ingredient"};
        System.out.println("Commands:");
        PrintCommands(commands);


        while (true){
            System.out.println();
            System.out.print("Enter command:");
            String command = scanner.nextLine();
            GetCommand(command, fileContents);

            if (command.equals("stop")){
                break;
            }

        }
    }

    public static void GetCommand(String command, String[] fileContent){

        if (command.equals("list")){
            ListCommand(fileContent);
        }

        if (command.equals("find name")){
            System.out.print("Searched word:");
            Scanner searchedWord =  new Scanner(System.in);
            FindNameCommand(fileContent, searchedWord.nextLine());
            System.out.println();
        }

        if (command.equals("find cooking time")){
            System.out.print("Max cooking time:");
            Scanner searchedWord =  new Scanner(System.in);
            FindMaxCookingTime(fileContent, searchedWord.nextLine());
            System.out.println();
        }

        if (command.equals("find ingredient")){
            System.out.print("ingredient:");
            Scanner searchedWord =  new Scanner(System.in);
            FindIngredient(fileContent, searchedWord.nextLine());
            System.out.println();
        }

    }

    public static void FindNameCommand(String[] fileContent, String rec){
        System.out.println();
        System.out.println("Recipes: ");
        for (String item: fileContent) {
            if (item.contains(rec)) {
                String[] food = item.split(" ");
                String name = food[0];
                String time = food[1];

                String data = String.format("%s, cooking time: %s", name, time).replace("-", " ");
                System.out.print(data);
                String ingredients = "";
                for (int i = 2; i < food.length; i++) {
                    ingredients += " " + food[i];
                }
                //System.out.println(ingredients);

            }
        }
    }

    public static void FindMaxCookingTime(String[] fileContent, String rec){
        System.out.println();
        System.out.println("Recipes: ");
        for (String item: fileContent) {

            String[] food = item.split(" ");
            String name = food[0];
            String time = food[1];

            if (Integer.valueOf(rec) >= Integer.valueOf(time)) {

                String data = String.format("%s, cooking time: %s", name, time).replace("-", " ");
                System.out.print(data);
                String ingredients = "";
                for (int i = 2; i < food.length; i++) {
                    ingredients += " " + food[i];
                }
                //System.out.println(ingredients);
                System.out.println();
            }

        }
    }

    public static void FindIngredient(String[] fileContent, String rec){
        System.out.println();
        System.out.println("Recipes: ");
        for (String item: fileContent) {

            String[] food = item.split(" ");
            String name = food[0];
            String time = food[1];

            String data = String.format("%s, cooking time: %s", name, time).replace("-", " ");


            String ingredients = "";
            for (int i = 2; i < food.length; i++) {
                ingredients += " " + food[i];
            }
            //System.out.println(ingredients);

            if (ingredients.contains(rec)) {
                System.out.print(data);
                System.out.println();
            }

        }
    }

    public static void PrintCommands(String[] commands){

        for (String command: commands){
            System.out.println(command);
        }

    }

    public static String[] readInFile(String file){
        String text = "";

        try {
            Scanner scanner = new Scanner(Paths.get(String.valueOf(file)));
            while (scanner.hasNext()){
                text+=scanner.nextLine().replace(" ","-")+" ";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text.split("  ") ;
    }


    public static void ListCommand(String[] fileContent){
        System.out.println();
        System.out.println("Recipes: ");
        for (String item: fileContent){

            String[] food = item.split(" ");
            String name = food[0];
            String time = food[1];

            String data = String.format("%s, cooking time: %s", name, time).replace("-"," ");
            System.out.print(data);
            String ingredients = "";
            for (int i = 2; i < food.length; i++){
                ingredients+=" "+food[i];
            }
            //System.out.println(ingredients);
            System.out.println("");
        }

    }


}