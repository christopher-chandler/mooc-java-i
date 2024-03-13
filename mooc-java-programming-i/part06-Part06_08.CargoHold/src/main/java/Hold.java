import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private int suitcaseWeight = 0;
    private ArrayList<Suitcase> suitcaseContainer = new ArrayList<>();

    public Hold(int weight){
        this.maxWeight = weight;
    }


    public void addSuitcase (Suitcase suitcase) {

        int intermediateWeight = suitcaseWeight+suitcase.totalWeight();
        if ( intermediateWeight <= maxWeight){
        suitcaseContainer.add(suitcase);
        suitcaseWeight+=suitcase.totalWeight();

        }

    }

    public String toString(){
        return String.format(" %d suitcases in (%d kg)", suitcaseContainer.size(),suitcaseWeight);
    }

    public void printItems(){

        for (Suitcase ele: suitcaseContainer) {
             ele.printItems();
        }
    }

}
