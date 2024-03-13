import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics(scanner);

        UI gradeStatistics = new UI (statistics);

        gradeStatistics.runProgram();

    }
}
