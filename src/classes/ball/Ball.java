package classes.ball;
import enums.Color;

import java.util.Random;


public class Ball {
    final Color color;
    private int weightGram;
    private static Random random = new Random();

    public Ball(){
        Color[] colors = Color.values();
        int colorNum = random.nextInt(0, Color.values().length);
        this.color = colors[colorNum];

        this.weightGram = random.nextInt(260, 450);
    }
    public Color getColor(){
        return this.color;
    }
    public int getWeightGram(){
        return this.weightGram;
    }
}
