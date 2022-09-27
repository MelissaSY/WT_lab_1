package task_6.main;
import classes.output.Print;
public class Main {
    public static void main(String[] args){
        double[] A = {1.45, 2.3, -4.2, 6.0911, 7, 10, 9.33};
        double[][] M = getMatrix(A);
        Print.printArray("Array", A);
        Print.printMatrix("Matrix", M);
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
