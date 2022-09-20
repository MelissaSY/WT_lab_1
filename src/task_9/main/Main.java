package task_9.main;
import classes.busket.Busket;
public class Main {
    public static void main(String[] args) {
        int numBalls = 7;
        Busket busket = new Busket(numBalls);
        System.out.format("Weight in grams: %d\nNumber of blue balls: %d\n", busket.getWeightGram(), busket.getBlueNum());
    }
}
