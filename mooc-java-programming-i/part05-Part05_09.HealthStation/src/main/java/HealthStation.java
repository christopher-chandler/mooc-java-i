
public class HealthStation {


    private int timesWeighed;

    public int weigh(Person person) {

        timesWeighed+=1;
        return person.getWeight();


    }

    public void feed(Person person) {
        person.setWeight(person.getWeight()+1);
        }


    public int weighings(){



        return timesWeighed;
    }
}
