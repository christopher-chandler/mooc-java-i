public class UI {
    private Statistics statistics ;
    public UI(Statistics statistics){
        this.statistics = statistics;
    }
    public void runProgram(){
        System.out.println("Enter point totals, -1 stops:");
        Statistics.determineScore();
    }

}
