package task_1.main;

public class Main {
    public static void main(String[] args) {
        double x = 8.5;
        double y = 5.2;
        System.out.format("result: %f", count(x, y));
    }
    private static double count(double x, double y) {
        double sinSqrCount = Math.pow(Math.sin(x+y), 2);
        double denominator = 2 + Math.abs(x - 2*x/(1 + x*x*y*y));
        return sinSqrCount/denominator + x;
    }
}
