
import java.util.Scanner;
import java.util.ArrayList;


public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> containers = new ArrayList<>();
        containers.add(0,0);
        containers.add(1,0);

        while (true) {
                System.out.println(String.format("First: %d/100", containers.get(0)));
                System.out.println(String.format("Second: %d/100", containers.get(1)));

                String input = scan.nextLine();
                if (input.equals("quit")) {
                    break;
                }

                String[] parts = input.split(" ");

                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);

                if (command.equals("add") && amount > 0 ){
                    Integer updateValue = containers.get(0)+amount;
                    if (updateValue <= 100 ){
                    containers.set(0, updateValue);
                    } else if (updateValue > 101) {
                        containers.set(0, 100);
                    }
                }

                if (command.equals("move")){
                    if (containers.get(0) > 0) {
                    Integer updateFirstValue = containers.get(0)-amount;
                    Integer updateSecondValue = containers.get(1)+amount;

                    if (updateFirstValue > 0 && updateFirstValue <= 100 && updateSecondValue > 0 && updateSecondValue <= 100 ){
                        containers.set(0, updateFirstValue);
                        containers.set(1, updateSecondValue);
                    } else {

                        containers.set(1, containers.get(0));
                        containers.set(0, 0);
                    }
                    }

                }

                if (command.equals("remove") && containers.get(1)-amount >= 1){
                    Integer updateValue = containers.get(1)-amount;
                    if (updateValue > 0 && updateValue <= 100){
                        containers.set(1, updateValue);

                }
                    else {
                    containers.set(0,0);
                    }
                    System.out.println(" ");

            }

            }


        }
    }


