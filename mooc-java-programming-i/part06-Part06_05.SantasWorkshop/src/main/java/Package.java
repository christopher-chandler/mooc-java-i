import java.util.ArrayList;

public class Package {

    private ArrayList<Gift> gifts = new ArrayList<>();

    public Package(){

    }

    public void addGift(Gift gift){
       Gift newGift = gift;
        gifts.add( gift);

    }

    public int totalWeight(){
        int giftSize = 0;

        for (Gift ele: gifts){
            giftSize+=ele.getWeight();
        }


        return giftSize;
    }



}
