import java.util.Scanner;
import static java.lang.Math.pow;
public class Tsk6Lab6 {
    public static class Oblast {
        public static boolean dots(double x, double y) {
            if  ((tri1(x, y) || tri2(x, y)) ||
                (4 > ((pow((x - 0), 2) + pow((y + 4), 2)))  &  (1 < (pow((x - 0), 2) + pow((y + 4), 2)))) ||
                (36 >= (pow((x - 0), 2) + pow((y - 0), 2)) & y >= 0)) {
            return false;
            }
            else return 36 >= (pow((x - 0), 2) + pow((y - 0), 2)) & y <= 0;
        }
        public static double k(double x1, double y1, double x2, double y2) {
            return (y1 - y2) / (x1 - x2);
        }
        public static double b(double x1, double y1, double x2, double y2) {
            return y1 - x1 * k(x1, y1, x2, y2);
        }
        public static boolean tri1(double x, double y) {
            return y > k(-3, -3, -4, 0) * x + b(-3, -3, -4, 0) &
                    (y > k(1, 0, -3, -3) * x + b(1, 0, -3, -3) &
                            (y < k(1, 0, -4, 0) * x + b(1, 0, -4, 0)));
        }

        public static boolean tri2(double x, double y) {
            return y > k(4, -3, 1, 0) * x + b(4, -3, 1, 0) &
                    (x < 4) & (x > 1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean ans = ans();
        while (ans) {
            System.out.println("Pls enter x-coordinate");
            double x = scan.nextDouble();
            System.out.println("Pls enter y-coordinate");
            double y = scan.nextDouble();
            System.out.println(Oblast.dots(x,y));
            ans = ans();
        }
    }
    public static boolean ans() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to proceed checking? 'y' or 'n'");
        String ans= scan.next();
        String yes = "y";
        return ans.equals(yes);
    }
}

