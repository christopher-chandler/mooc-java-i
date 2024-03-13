

public class Fitbyte {

    private int age;
    private int restingHeartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        double maximumHeartRate = (double) (206.3 - (0.711 * age));

        double result = (double) ((maximumHeartRate-restingHeartRate)*(percentageOfMaximum)+restingHeartRate);

        return result;
    }

}
