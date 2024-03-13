import java.util.ArrayList;
import java.util.List;

public class TodoList {


    private ArrayList<String> errands = new ArrayList<>();

    public TodoList (){

    }

    public void add (String task){
        errands.add(task);
    }
    public void print() {

        int count = 1;
        for (String task: errands) {
            System.out.print(count);
            System.out.println(": "+task);
            count++;
        }

    }

    public void remove (int number) {
        errands.remove(number-1);

    }


}
