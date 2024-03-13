import java.util.ArrayList;

public class Stack {

        private ArrayList<String> stackArray= new ArrayList();

        public void add(String value) {

            stackArray.add(value);
        }

        public boolean isEmpty(){

            if(stackArray.size()==0){
                return true;
            }
            else {
                return false;
            }

        }

        public ArrayList<String> values(){

            return stackArray;
        }

        public String take (){

            String lastElement = stackArray.get(stackArray.size()-1);
            stackArray.remove(lastElement);

            return lastElement;

        }



}