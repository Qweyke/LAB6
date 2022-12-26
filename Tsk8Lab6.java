import static java.lang.Math.*;
import java.util.Scanner;

public class Tsk8Lab6 {
    public static class FunctionMy {
        public static double FunctionMy1(double y) {
            double d = 10;
            return log(d) + ((3.5 * (d * d) + 1) / (cos(2 * y)));
        }
        public static double FunctionMy2(double y) {
            double x = 10;
            return (sqrt(((2+y)*(2+y))+(pow(sin(y+5),1d/7))))
                    /(log(x + 1) - pow(y, 3));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        double sum = 0;
        while (n < 10){
            System.out.println("input y");
            double y = sc.nextDouble();
            sum += FunctionMy.FunctionMy1(y) + FunctionMy.FunctionMy2(y);
            n++;
        }
        System.out.println(sum);
    }
}
