
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String StringMessage (){

        if (elements.size() == 0) {
            return String.format("The collection %s is empty.",name);
        }
            if (elements.size() == 1) {
                return String.format("The collection %s has %d element:\n",name,elements.size());
            }
        else {
                return String.format("The collection %s has %d elements:\n",name,elements.size());
            }


    }

    public String toString() {


        if (elements.size() > 0) {

        String newString ="";
        int length = elements.size();
        for (String ele: elements){
            length--;
            if (length != 0){


            newString+=ele+"\n";
             }

            else{
                newString+=ele;
            }
        }

        return StringMessage()+newString;

    }
         else {

            return StringMessage();
    }
    }

}
