import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BasicWorkout> basicWorkouts = getDemoData();

        Collections.sort(basicWorkouts);
        print(basicWorkouts);
        System.out.println("------");
        System.out.printf("total energy: %dkcal\n",totalEnergy(basicWorkouts));


        System.out.println("------");
        System.out.printf("mean intesity: %1.1f\n",meanIntensity(basicWorkouts));

    }
    public static void print(List<BasicWorkout> basicWorkouts){
        for (BasicWorkout x: basicWorkouts){
            System.out.println(x.toString());
        }
    }
    public static List<BasicWorkout> getDemoData(){
        List<BasicWorkout> basicWorkouts = new LinkedList<BasicWorkout>();
        basicWorkouts.add(new BasicWorkout(new Date(2018, 04, 1), 8200, 7, 1200, "Bike trip to Krems"));
        basicWorkouts.add(new BasicWorkout(new Date(2018, 05, 8), 1200, 5, 500, "Digging a hole"));
        basicWorkouts.add(new Running(new Date(2018, 05, 7), 3600, "Evening run from work to home", 12000));
        basicWorkouts.add(new PushUp(new Date(2021,5,6),600,80));
            return basicWorkouts;
    }
        public static double meanIntensity(List<BasicWorkout> basicWorkouts){
            double mean = 0;
            int j = 0;
            for (BasicWorkout x: basicWorkouts){
                mean = mean + x.getIntensity();
                j++;
            }
            mean = mean/j;
            return mean;
        }
    public static int totalEnergy(List<BasicWorkout> basicWorkouts){
        int totalEnergy = 0;
        for (BasicWorkout x: basicWorkouts){
            totalEnergy = totalEnergy + x.getEnergy();
        }
        return totalEnergy;
    }


}




