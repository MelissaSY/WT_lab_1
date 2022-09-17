package task_7.main;

public class Main {
    public static void main(String[] args) {
        double[] A = {1.45, 2.3, -4.2, 6.09, 7, 10, 9.33};
        System.out.print("Array: ");
        for (double a:
                A) {
            System.out.format("%.2f ", a);
        }
        System.out.println();
        shellSort(A);
        System.out.print("Sorted array: ");
        for (double a:
                A) {
            System.out.format("%.2f ", a);
        }
        System.out.println();
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
