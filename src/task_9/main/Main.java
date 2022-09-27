package task_9.main;
import classes.basket.Basket;
public class Main {
    public static void main(String[] args) {
        int numBalls = 7;
        Basket basket = new Basket(numBalls);
        System.out.format("Weight in grams: %d\nNumber of blue balls: %d\n", basket.getWeightGram(), basket.getBlueNum());
    }
}
