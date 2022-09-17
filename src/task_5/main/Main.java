package task_5.main;

public class Main {
    public static void main(String[] args) {
        int[] A = {1, 2, -4, 6, 7, 10, 9};
        System.out.print("Array elements: ");
        for (int a:
                A) {
            System.out.format("%d ", a);
        }
        System.out.println();
        System.out.format("Least number of deletions: %d\n", leastDeletions(A));
    }
    public static int findLongestIncreasingSequence(int[] arr){
        int length = 0;
        int arrLength = arr.length;
        int[] lis = new int[arrLength];
        for(int i = 0; i < arrLength; i++){
            lis[i] = 1;
        }
        for(int i = 1; i < arrLength; i++){
            for(int j = 0; j < i; j++){
                if(arr[i] > arr[j] && lis[i] < lis[j] + 1){
                    lis[i] = lis[j] + 1;
                }
            }
        }
        for(int i = 0; i < arrLength; i++){
            if(length < lis[i]){
                length = lis[i];
            }
        }
        return length;
    }
    public static int leastDeletions(int[] arr){
        int length = findLongestIncreasingSequence(arr);
        return arr.length - length;
    }
}
