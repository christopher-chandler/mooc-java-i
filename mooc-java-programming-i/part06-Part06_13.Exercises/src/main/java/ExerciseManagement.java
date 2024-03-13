import java.util.ArrayList;

public class ExerciseManagement {

    private ArrayList<Exercise> exercises;


    public ExerciseManagement(){
        this.exercises = new ArrayList<>();
    }

    public ArrayList<String> exerciseList(){
        ArrayList<String> list = new ArrayList<>();
        for (Exercise exercise: exercises) {
            list.add(exercise.getName());
        }
        return list;
    }

    public void add(String write_a_test) {
        this.exercises.add(new Exercise(write_a_test));
    }

    public void markAsCompleted(String new_exercise) {
       for (Exercise ex: exercises) {

           if (ex.getName().equals(new_exercise)) {
               ex.isCompleted();
           }
       }
    }

    public boolean isCompleted(String new_exercise) {
         for (Exercise ex: exercises) {
             if (ex.getName().equals(new_exercise)) {

                 return ex.isCompleted();
             }
         }
        return false;
    }
}
