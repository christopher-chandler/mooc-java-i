import java.util.Scanner;

public class UI {

    private Container liquidContainers = new Container();

    public UI(){}

    public void startProgram(){
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println(String.format("First: %d/100", liquidContainers.returnContainers().get(0)));
            System.out.println(String.format("Second: %d/100",  liquidContainers.returnContainers().get(1)));

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add") && amount > 0 ){

                Integer updateValue = liquidContainers.returnContainers().get(0)+amount;
                if (updateValue <= 100 ){
                    liquidContainers.returnContainers().set(0, updateValue);
                } else if (updateValue > 101) {
                    liquidContainers.returnContainers().set(0, 100);
                }
            }

            if (command.equals("move")){
                if (liquidContainers.returnContainers().get(0) > 0) {
                    Integer updateFirstValue = liquidContainers.returnContainers().get(0)-amount;
                    Integer updateSecondValue = liquidContainers.returnContainers().get(1)+amount;

                    if (updateFirstValue > 0 && updateFirstValue <= 100 && updateSecondValue > 0 && updateSecondValue <= 100 ){
                        liquidContainers.returnContainers().set(0, updateFirstValue);
                        liquidContainers.returnContainers().set(1, updateSecondValue);
                    } else {

                        liquidContainers.returnContainers().set(1, liquidContainers.returnContainers().get(0));
                        liquidContainers.returnContainers().set(0, 0);
                    }
                }

            }

            if (command.equals("remove") && liquidContainers.returnContainers().get(1)-amount >= 1){
                Integer updateValue = liquidContainers.returnContainers().get(1)-amount;
                if (updateValue > 0 && updateValue <= 100){
                    liquidContainers.returnContainers().set(1, updateValue);

                }
                else {
                    liquidContainers.returnContainers().set(0,0);
                }
                System.out.println(" ");

            }

        }

    }


}
