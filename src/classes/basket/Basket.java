package classes.basket;
import classes.ball.Ball;
import enums.Color;

import java.util.ArrayList;

public class Basket {
    private final ArrayList<Ball> balls;
   // private int blueNum;
    private int weightGram;
    final int num;
    public Basket(int num) {
        this.weightGram = 0;
        this.num = num;
        balls = new ArrayList<>();
        Ball ball;
        for(int i = 0; i < this.num; i++){
            ball = new Ball();
            this.weightGram += ball.getWeightGram();
            this.balls.add(ball);
        }
    }
    public int getBlueNum(){
        int blueNum = 0;
        for(int i = 0; i < this.num; i++){
            if(this.balls.get(i).getColor() == Color.BLUE){
                blueNum++;
            }
        }
        return blueNum;
    }
    public int getWeightGram(){
        return this.weightGram;
    }
}
