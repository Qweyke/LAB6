import static java.lang.Math.*;
public class Tsk10Lab6 {
    public static void main(String[] args) {
        double h;
        double sum;
        for (double n = 10; n <= 10000; n *= 10) {
            h = 1 / n;
            sum = 0;
            double a = 1;
            for (int i = 1; i <= n; i++) {
                a += h;
                sum += (pow(a, a) + 10 * pow(a, 2) - (a) * sin(a)) * h;
            }
            System.out.println("n: " + n + "     h: " + h + "    S: " + sum + "     23.94   " + (sum - 23.94));
        }
    }
}
