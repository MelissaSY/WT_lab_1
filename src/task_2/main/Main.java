package task_2.main;

public class Main {
    public static void main(String[] args)  {
        double x = 1;
        double y = 3;
        if (checkBelonging(x, y)) {
            System.out.format("(%f, %f) belongs to the range", x, y); }
        else {
            System.out.format("(%f, %f) does not belong to the range", x, y); }
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
            } else{
                isIn = x<= xRightBottom && x >= xLeftBottom;
            }
        }
        return isIn;
    }
}
