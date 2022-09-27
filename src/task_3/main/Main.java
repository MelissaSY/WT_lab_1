package task_3.main;

import java.io.PrintWriter;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        double a = -1.5;
        double b = 11.2;
        double h = 0.5;
        TreeMap<Double, Double> result = count(a, b, h);
        printResult(result);
    }
    private static void printResult(TreeMap<Double, Double> result) {
        try(PrintWriter output = new PrintWriter(System.out)) {
            output.printf("%-20s|%20s%n", "x", "tg(x)");
            for(int i = 0; i < 41; i++) {
                output.print("-");
            }
            output.print("\n");
            for (Double x:
                 result.keySet()) {
                output.printf("%-20s|%20s%n", x.toString(), result.get(x).toString());
            }
            for(int i = 0; i < 41; i++) {
                output.print("-");
            }
        }
    }
    private static TreeMap<Double, Double> count (double a, double b, double h) {
        TreeMap<Double, Double> result = new TreeMap<>();
        double x = a;
        while(x <= b) {
            result.put(x, Math.tan(x));
            x += h;
        }
        return result;
    }

}
