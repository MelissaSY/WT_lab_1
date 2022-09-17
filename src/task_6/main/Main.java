package task_6.main;

public class Main {
    public static void main(String[] args){
        double[] A = {1.45, 2.3, -4.2, 6.09, 7, 10, 9.33};
        double[][] M = getMatrix(A);
        System.out.print("Array elements: ");
        for (double a:
                A) {
            System.out.format("%.2f ", a);
        }
        System.out.println();
        System.out.println("Matrix elements: ");
        for (double[] array:
             M) {
            for (double a:
                 array) {
                System.out.format("%.2f ", a);
            }
            System.out.println();
        }
    }
    public static double[][] getMatrix(double[] arr){
        int arrLength = arr.length;
        int elementNum = 0;
        double[][] matrix = new double[arrLength][arrLength];
        for(int i = 0; i < arrLength; i++){
            for(int j = 0; j < arrLength; j++){
                matrix[i][j] = arr[elementNum%arrLength];
                elementNum++;
            }
            elementNum = elementNum - (arrLength - 1);
        }
        return matrix;
    }
}
