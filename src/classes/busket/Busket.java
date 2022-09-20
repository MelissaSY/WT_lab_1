package classes.busket;
import classes.ball.Ball;
import enums.Color;

import java.util.ArrayList;
import java.util.Random;


public class Busket {
    private ArrayList<Ball> balls;
    private int blueNum;
    private int weightGram;
    private int num;
    private static Random random = new Random();
    public Busket(int num){
        this.weightGram = 0;
        this.num = num;
        balls = new ArrayList<>();
        Ball ball;
        for(int i = 0; i < this.num; i++){
            ball = new Ball();
            this.weightGram += ball.getWeightGram();
            this.balls.add(ball);
            if(ball.getColor() == Color.BLUE){
                this.blueNum++;
            }
        }
    }
    public int getBlueNum(){
        return this.blueNum;
    }
    public int getWeightGram(){
        return this.weightGram;
    }
}
