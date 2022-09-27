package task_7.main;
import classes.output.Print;
public class Main {
    public static void main(String[] args) {
        double[] A = {1.45, 2.3, -4.2, 6.09, 7, 10, 9.33};
        Print.printArray("Array", A);
        shellSort(A);
        Print.printArray("Sorted array", A);
    }
    public static void shellSort(double[] array){
        int arrLength = array.length;
        for (int step = arrLength / 2; step > 0; step /= 2) {
            for (int i = step; i < arrLength; i++) {
                for (int j = i - step; j >= 0 && array[j] > array[j + step] ; j -= step) {
                    double x = array[j];
                    array[j] = array[j + step];
                    array[j + step] = x;
                }
            }
        }
    }
}
