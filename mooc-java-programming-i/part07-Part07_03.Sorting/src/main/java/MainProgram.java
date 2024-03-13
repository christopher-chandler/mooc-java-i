import java.util.Arrays;

public class MainProgram {


    public static int smallest(int[] array ){

        int smallestNumber = array[0];

        for (int i: array) {
            if (i <= smallestNumber){
                smallestNumber = i;
            }
        }

        return smallestNumber;
    }

    public static int indexOfSmallest(int[] array){

       int smallestNumber = smallest(array);

       for (int i=0;  i < array.length; i++ ){

           if (array[i] == smallestNumber){
               return i;
           }
       }
        return 0;
    }

    public static int smallestofSlicedTable(int[] table, int startIndex) {

        int arrayLength = table.length - startIndex;
        int[] slicedTable = new int[arrayLength];
        int counter = 0;

        for (int i = 0; i < table.length; i++) {

            if (i >= startIndex) {
                slicedTable[counter] = table[i];
                counter++;
            }

        }

        int smallestNumber = smallest(slicedTable);
        return smallestNumber;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {

        int arrayLength = table.length-startIndex;
        int[] slicedTable = new int[arrayLength];
        int counter = 0;

        for (int i = 0; i < table.length; i++){

            if (i >= startIndex) {
                slicedTable[counter] = table[i];
                counter++;
            }

        }

        int smallestNumber = smallest(slicedTable);
        int updatePosition = 0;

        for (int i = 0; i < table.length; i++){
                if (table[i] == smallestNumber){
                    updatePosition = i;
                }
            }

        return updatePosition;
    }

    public static void swap(int[] array, int index1, int index2) {

       int number1 = array[index1];
       int number2 = array[index2];

       array[index1]=number2;
       array[index2]=number1;

    }

    public static void sort(int[] array) {


    for (int i = 0; i <array.length; i++) {
        String arrayString = Arrays.toString(array);
        System.out.println(arrayString);
        int smallestFrom = indexOfSmallestFrom(array,i);
        swap(array, i, smallestFrom);
        }

    }

    public static void main(String[] args) {

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);

    }

}
