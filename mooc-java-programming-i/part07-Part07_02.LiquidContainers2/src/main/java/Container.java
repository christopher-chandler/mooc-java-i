import java.util.ArrayList;

public class Container {
    private ArrayList<Integer> containers = new ArrayList<>();

    public Container(){
        containers.add(0,0);
        containers.add(1,0);
    }

    public ArrayList<Integer> returnContainers () {
        return  containers;
    }

    public void add(int amount) {
        if ( amount > 0 ){
            Integer updateValue = containers.get(0)+amount;
            if (updateValue <= 100 ){
                containers.set(0, updateValue);
            } else if (updateValue > 101) {
                containers.set(0, 100);
            }
        }
    }

    public void remove(int amount) {

        if (containers.get(0)-amount < 0){
            Integer updateValue = containers.get(0)-amount;
            if (updateValue > 0 && updateValue <= 100){
               containers.set(0, updateValue);
            }
            else {
                containers.set(0,0);
            }
            System.out.println(" ");
        }
    }

    public int contains(int index){
        return containers.get(index);
    }

    public String toString(){
        return String.format("%d/100",containers.get(0));
    }

}
