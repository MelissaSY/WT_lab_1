package task_3.main;

public class Main {
    public static void main(String[] args) {
        double a = -0.5;
        double b = 11.2;
        double h = 3.1;
        Count(a, b, h);
    }
    private static void Count(double a, double b, double h) {
        double x = a;
        while(x <= b){
            System.out.format("%f %f", x, Math.tan(x));
            x += h;
        }
    }

}
