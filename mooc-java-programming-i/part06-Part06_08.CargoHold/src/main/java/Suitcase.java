import java.util.ArrayList;

public class Suitcase {
    private int maximumWeight = 0;
    private int currentWeight =0;
    private ArrayList<Item> items = new ArrayList<>();

    public Suitcase(int maximumWeight){
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item item){
    if (currentWeight+item.getWeight() <= maximumWeight){
        currentWeight+=item.getWeight();
        items.add(item);
        }
    }

    public int totalWeight (){
        return currentWeight;
    }

    public Item heaviestItem(){

        int weight = 0;
        ArrayList<Item> heaviest = new ArrayList<>();

        for (Item ele:items){

            if (ele.getWeight() > weight){
                weight = ele.getWeight();

                heaviest.add(ele);
            }

        }

        if (heaviest.size() > 0) {
            System.out.println(heaviest);
            Item result = heaviest.get(heaviest.size()-1 );
            return result;
        }
        else {

            return null;
        }

    }

    public void printItems(){

        for (Item ele:items){
            System.out.println(ele);
        }

    }

    public String toString(){

        if (items.size() == 0){
            return "no items (0 kg)";
        }
        else if (items.size() == 1) {
            return String.format("%d item (%d kg)", items.size(), currentWeight);
        }
        else {
            return String.format("%d items (%d kg)", items.size(), currentWeight);
        }
    }

}
