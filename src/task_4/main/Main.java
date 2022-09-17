package task_4.main;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] A = {1, 2, -4, 6, 7};
        ArrayList<Integer> primeNumbers = searchPrime(A);
        System.out.print("Array elements: ");
        for (int a:
             A) {
            System.out.format("%d ", a);
        }
        System.out.print("\nThe numbers of primes: ");
        primeNumbers.forEach((a) -> System.out.format("%d ", a));
        System.out.println();
    }
    public static ArrayList<Integer> searchPrime(int[] A){
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        boolean isPrime;
        int i;
        for(int j = 0; j < A.length; j++) {
            isPrime = A[j] > 0;
            i = 2;
            while(i<=A[j]/2 && isPrime) {
                isPrime = A[j]%i != 0;
                i++;
            }
            if(isPrime){
                primeNumbers.add(j);
            }
        }
        return primeNumbers;
    }
}
