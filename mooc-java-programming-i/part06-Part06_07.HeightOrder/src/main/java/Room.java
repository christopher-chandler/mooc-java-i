import java.util.ArrayList;
import java.util.List;

public class Room {

    private ArrayList<Person> personArrayList = new ArrayList<>();
    public Room (){}

    public void add (Person person){
        personArrayList.add(person);
    }

    public Person take(){

        Person shortestPerson = shortest();
        ArrayList<Person> newPersons = new ArrayList<>();

        for(Person ele: personArrayList){
            if ( ele != shortestPerson) {
                newPersons.add(ele);
            }

            }

        personArrayList = newPersons;
        return shortestPerson;
    }



    public Person shortest(){

        if (personArrayList.size() != 0) {

            int height = personArrayList.get(0).getHeight();
            ArrayList<Person> p = new ArrayList<>();

            for(Person ele: personArrayList){
                if (ele.getHeight() <= height) {
                    height = ele.getHeight();
                    p.add(ele);
                }
            }

            return p.get(p.size()-1);
        }
        else{
            return  null;
        }
    }

    public boolean isEmpty(){

        if (personArrayList.size() != 0){
            return  false;
        } else {
            return true;
        }
    }


    public ArrayList<Person> getPersons(){

            return personArrayList;



    }

}
