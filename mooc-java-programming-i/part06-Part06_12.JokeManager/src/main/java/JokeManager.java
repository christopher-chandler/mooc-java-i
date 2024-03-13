import java.util.ArrayList;
import java.util.Random;


public class JokeManager {

    private ArrayList<String> jokes = new ArrayList<>();
    public void addJoke (String joke){
        jokes.add(joke);
    }


    public String drawJoke(){
        if (jokes.size() != 0){
        Random draw = new Random();
        int index = draw.nextInt(jokes.size());
        return jokes.get(index);}
        else  return "Jokes are in short supply.";
    }


    public void printJokes(){
        for (String joke: jokes){
            System.out.println(joke);
        }
    }


    public ArrayList<String> returnJokes (){
        return jokes;
    }



}
