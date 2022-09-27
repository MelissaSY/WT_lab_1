package task_2.main;

public class Main {
    public static void main(String[] args)  {
        for(double i = -6.5; i < 6.5; i = i + 0.5) {
            for(double j = -3.5; j < 5.5; j = j + 0.5) {
                printBelonging(i, j);
            }
        }
    }
    private static boolean checkBelonging(double x, double y)
    {
        double xRightUp = 4;
        double xRightBottom = 6;
        double xLeftUp = -4;
        double xLeftBottom = -6;
        double yUpUp = 5;
        double yUpBottom = 0;
        double yBottomBottom = -3;
        boolean isIn = false;
        if(y <= yUpUp && y >= yBottomBottom) {
            if(y > yUpBottom) {
                isIn = x <= xRightUp && x >= xLeftUp;
            } else {
                isIn = x<= xRightBottom && x >= xLeftBottom;
            }
        }
        return isIn;
    }
    private static void printBelonging(double x, double y) {
        if (checkBelonging(x, y)) {
            System.out.format("(%f, %f) belongs to the range\n", x, y); }
        else {
            System.out.format("(%f, %f) does not belong to the range\n", x, y);
        }
    }
}
