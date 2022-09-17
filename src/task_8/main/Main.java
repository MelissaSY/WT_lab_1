package task_8.main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> sequenceA = new ArrayList<>(Arrays.asList(-4.5, 0.0, 1.2, 1.2, 4.5, 7.8));
        ArrayList<Double> sequenceB = new ArrayList<>(Arrays.asList(-8.8, -1.0, 1.2, 1.2, 4.5, 6.4, 7.8, 7.8, 9.34));
        System.out.print("Sequence A: ");
        for (double a:
                sequenceA) {
            System.out.format("%.2f ", a);
        }
        System.out.println();

        System.out.print("Sequence B: ");
        for (double a:
                sequenceB) {
            System.out.format("%.2f ", a);
        }
        System.out.println();

        insertIncreasing(sequenceA, sequenceB);

        System.out.print("New sequence A: ");
        for (double a:
                sequenceA) {
            System.out.format("%.2f ", a);
        }
        System.out.println();
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
