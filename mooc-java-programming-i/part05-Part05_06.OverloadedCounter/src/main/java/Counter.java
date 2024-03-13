public class Counter {

    private int startValue;

    public Counter(int startValue) {
        this.startValue=startValue;
    }

    public Counter(){
         startValue=0;
    }

    public int value () {
        return  startValue;
    }


    public void increase(){
        startValue++;
    }

    public void increase(int increaseBy){

        if (startValue > 0  && increaseBy > 0){
            startValue=startValue+increaseBy;
        }


    }


    public void decrease (int decreaseBy){
        if (decreaseBy > 0) {
            startValue=startValue-decreaseBy;
        }
    }


    public void decrease(){
        startValue--;
    }

}
