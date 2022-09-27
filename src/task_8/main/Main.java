package task_8.main;
import java.util.ArrayList;
import java.util.Arrays;
import classes.output.Print;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> sequenceA = new ArrayList<>(Arrays.asList(-4.5, 0.0, 1.2, 1.2, 4.5, 7.8));
        ArrayList<Double> sequenceB = new ArrayList<>(Arrays.asList(-8.8, -1.0, 1.2, 1.2, 4.5, 6.4, 7.8, 7.8, 9.34));
        Print.printArrayList("Sequence A", sequenceA);
        Print.printArrayList("Sequence B", sequenceB);
        insertIncreasing(sequenceA, sequenceB);
        Print.printArrayList("Sequence A", sequenceA);
    }
    public static void insertIncreasing(ArrayList<Double> sequenceA, ArrayList<Double> sequenceB){
        int elementNum = 0;
        int ANum = sequenceA.size();
        for (double b:
                sequenceB) {
            while(ANum > elementNum && sequenceA.get(elementNum) < b){
                elementNum++;
            }
            sequenceA.add(elementNum, b);
            ANum++;
        }
    }
}
