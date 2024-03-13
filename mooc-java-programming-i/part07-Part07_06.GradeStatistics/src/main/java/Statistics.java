import java.util.ArrayList;
import java.util.Scanner;

public class Statistics {

    private static Scanner scanner;
 
    public  Statistics(Scanner scanner) {
        Statistics.scanner = scanner;
    }

    public static void determineScore() {

        double averagePoints=0;
        double averagePointCount=0;

        double passingGrade=0;
        double passingGradeCount=0;

        ArrayList<Integer> stars = new ArrayList<>();
        for (int i = 0; i < 6; i++ ){
            stars.add(0);
        }

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            } else {

                // Part 1
                if (number >= 0 && number <= 100) {
                    averagePoints+=number;
                    averagePointCount++;
                }

                // Part 2
                if (number >= 50 && number <= 100) {
                    passingGrade+=number;
                    passingGradeCount++;
                }

                // part 4
                if ( number >=  0 && number < 50) {

                    int index = 0;
                    Integer  value = stars.get(index);
                    value = value +1;
                    stars.set(index,value);
                }

                if ( number >= 50 && number < 60) {

                    int index = 1;
                    Integer  value = stars.get(index);
                    value = value +1;
                    stars.set(index,value);
                }


                if ( number >= 60 && number < 70) {

                    int index = 2;
                    Integer  value = stars.get(index);
                    value = value +1;
                    stars.set(index,value);
                }


                if ( number >= 70 && number < 80) {

                    int index = 3;
                    Integer  value = stars.get(index);
                    value = value +1;
                    stars.set(index,value);
                }


                   if ( number >= 80 && number < 90) {

                    int index = 4;
                    Integer  value = stars.get(index);
                    value = value +1;
                    stars.set(index,value);
                }
                if ( number >= 90 && number <=100) {

                    int index = 5;
                    Integer  value = stars.get(index);
                    value = value +1;
                    stars.set(index,value);
                }
            }
        }

        double average  = averagePoints / averagePointCount;
        double passing  = passingGrade / passingGradeCount;
        double passPercentange = 100*(passingGradeCount / averagePointCount);
        System.out.println(averagePointCount);

        // part 1
        System.out.print("Point average (all): ");
        System.out.println(average);

        // part 2
        System.out.print("Point average (passing): ");
        if (passing < 0){
        System.out.println("-");
        } else {
            System.out.println(passing);
        }

        // part 3
        System.out.print("Point average (percentage): ");
        System.out.println(passPercentange);

        // part 4
        System.out.println("Grade distribution: ");

        for (int i = 5; i !=-1; i--){

            String starAmount = "";
            int star = stars.get(i);

            for (int j = 0; j < star; j++) {
                starAmount = starAmount + "*";
            }

            String starResult = String.format("%d: %s",i, starAmount);
            System.out.println(starResult);

        }
    }

}


