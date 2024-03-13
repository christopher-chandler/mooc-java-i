
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

    public String longest(){

        if (elements.size()  == 0){

            return null;
        } else {

            int longestElement = 0;
            String longestName = "";

            for (String ele : elements) {

                if (ele.length() > longestElement){
                    longestElement+=ele.length();
                    longestName=ele;
                }
            }
            return longestName;
        }


    }

}
