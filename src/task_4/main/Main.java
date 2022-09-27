package task_4.main;
import classes.output.Print;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] A = {1, 2, -4, 6, 7};
        ArrayList<Integer> numberOfPrimes = searchPrime(A);
        Print.printArray("Array", A);
        printResults(numberOfPrimes);
    }

    public static void printResults(ArrayList<Integer> numberOfPrimes) {
       System.out.print("\nThe numbers of primes:");
        numberOfPrimes.forEach((a) -> System.out.format(" %d", a));
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
