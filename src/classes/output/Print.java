package classes.output;

import java.util.ArrayList;
public class Print {
    public static void printArray(String arrayName, int[] Array) {
        System.out.printf("%s:", arrayName);
        for (int a:
                Array) {
            System.out.format(" %d", a);
        }
        System.out.println();
    }
    public static void printArray(String arrayName, double[] Array) {
        System.out.printf("%s:", arrayName);
        for (double a:
                Array) {
            System.out.format(" %f", a);
        }
        System.out.println();
    }
    public static void printArrayList(String arrayName, ArrayList<Double> Array) {
        System.out.printf("%s:", arrayName);
        for (double a:
                Array) {
            System.out.format(" %f", a);
        }
        System.out.println();
    }

    public static void printMatrix(String matrixName, double[][] Matrix) {
        System.out.printf("%s:", matrixName);
        for (double[] array:
                Matrix) {
            for (double a:
                    array) {
                System.out.format(" %f ", a);
            }
            System.out.println();
        }
    }
}
