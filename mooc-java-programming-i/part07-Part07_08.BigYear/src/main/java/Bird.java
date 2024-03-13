public class Bird {

    private String Name;
    private String LatinName;
    private int Observation;


    public Bird(String Name, String LatinName){
        this.Name = Name;
        this.LatinName =LatinName;
        this.Observation = 0;
    }

    public String getName(){
        return String.format("%s (%s):", Name, LatinName);
    }

    public int getObservations(){
        return Observation;
    }

    public void increaseObservations(){
        this.Observation++;
    }

    @Override
    public String toString() {

        if (Observation > 1) {

            return String.format("%s (%s): %s observations", Name, LatinName, Observation);
        } else {
            return String.format("%s (%s): %s observation", Name, LatinName, Observation);

        }
    }
}
